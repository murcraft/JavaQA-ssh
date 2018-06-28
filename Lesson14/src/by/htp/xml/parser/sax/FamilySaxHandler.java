package by.htp.xml.parser.sax;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.xml.parser.sax.entity.Child;
import by.htp.xml.parser.sax.entity.Family;
import by.htp.xml.parser.sax.entity.FamilyEnum;
import by.htp.xml.parser.sax.entity.Father;
import by.htp.xml.parser.sax.entity.Mother;
import by.htp.xml.parser.sax.entity.Person;

public class FamilySaxHandler extends DefaultHandler {
	
	private List<Family> familyL = new ArrayList<Family>();
	private Family family = null;
	private Person person = null;
	private Mother mother = null;
	private Father father = null;
	private Child child = null;
	private StringBuilder text;
	private Person current;
	
	private FamilyEnum currentEnum = null;
	private EnumSet<FamilyEnum> withText;

//	
//	public FamilySaxHandler() {
//		familySet = new HashSet<Family>();
//		withText = EnumSet.range(FamilyEnum.NAME, FamilyEnum.GENDER);
//	}
	
	public List<Family> getFamilySet(){
		return familyL;
	}


	@Override
	public void startDocument() throws SAXException {
		System.out.println("Parsing is started");
		
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println(familyL);
		System.out.println("Parsing is ended");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//		System.out.println("startElement " + localName);
		text = new StringBuilder();
		
		if(qName.equals("family")) {
			family = new Family();
			family.setId(Integer.parseInt(attributes.getValue("id")));
			System.out.println(qName);
		}
		
		if(localName.equals("mother")) {
			current = new Mother();
//			family.setMother(mother);
			String maidenName= attributes.getValue("maiden-name");
			((Mother) current).setMaidenName(maidenName);
			family.setMother((Mother) current);
			System.out.println(qName + "[maiden name: " + maidenName + "]");
		}
		
		if(qName.equals("father")) {
			current = new Father();
			family.setFather((Father) current);
			System.out.println(qName);
		}
		
		if(qName.equals("child")) {
			current = new Child();
			family.setChild((Child) current);
			System.out.println(qName);
		}

	}

	public void characters(char[] ch, int start, int length) throws SAXException {
//		System.out.println("characters: " + new StringBuilder().append(ch, start, length));
		text.append(ch, start, length);
	}


	public void endElement(String uri, String localName, String qName) throws SAXException {
		FamilyEnum tags = FamilyEnum.valueOf(qName.toUpperCase().replace("-", "_"));
		
		switch(tags) {
		case NAME:
			current.setName(text.toString());
//				family.getMother().setName(text.toString());
//				System.out.println(mother);
//	
//			if(current.equals(father)) {
//				family.getFather().setName(text.toString());
//			}
//			if(current.equals(child)) {
//				family.getChild().setName(text.toString());
//			}
			System.out.println("name:  " + text.toString());
		break;
		case SURNAME:
			current.setSurname(text.toString());
//			if(current.equals(mother)) {
//				family.getMother().setSurname(text.toString());	
//			}
//			if(current.equals(father)) {
//				family.getFather().setSurname(text.toString());	
//			}
//			if(current.equals(child)) {
//				family.getChild().setSurname(text.toString());	
//			}
				System.out.println("surname: " + text.toString());
			break;	
		case AGE:
			current.setAge(Integer.parseInt(text.toString()));
//			if(current.equals(mother)) {
//				family.getMother().setAge(Integer.parseInt(text.toString()));
//			}
//			if(current.equals(father)) {
//				family.getFather().setAge(Integer.parseInt(text.toString()));
//			}
//			if(current.equals(child)) {
//				family.getChild().setAge(Integer.parseInt(text.toString()));
//			}
			
			System.out.println("age: " + text.toString());
		break;
		case MILITARY:
			current.setMilitary(text.toString());
//			family.getFather().setMilitary(text.toString());
			
			System.out.println(text.toString());
		break;
		case GENDER:
			 current.setGender(text.toString());
//			family.getChild().setGender(text.toString());
			
			System.out.println(text.toString());
		break;
		case MOTHER:
			mother = (Mother) current;
			family.setMother(mother);
			current = mother;
		break;
		case FATHER:
			father = (Father) current;
			family.setFather(father);
		break;
		case CHILD:
			child = (Child) current;
			family.setChild(child);
		break;
			
		case FAMILY:

			System.out.println(familyL);
			familyL.add(family);
			family = null;
		break;
		}
		
	}
	



}
