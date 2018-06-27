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
	
	private Set<List<Family>> familySet = null;
	private List<Family> familyList = null;
	
	private Person person = null;
	private Mother mother = null;
	private Father father = null;
	private Child child = null;
	
	private FamilyEnum currentEnum = null;
	private EnumSet<FamilyEnum> withText;

	
	public FamilySaxHandler() {
		familySet = new HashSet<List<Family>>();
		withText = EnumSet.range(FamilyEnum.NAME, FamilyEnum.GENDER);
	}
	
	public Set<List<Family>> getFamilySet(){
		return familySet;
	}
	
	public List<Family> getFamilyList(){
		return familyList;
	}

	@Override
	public void startDocument() throws SAXException {
//		System.out.println("startDocument()");
	}

	@Override
	public void endDocument() throws SAXException {
//		System.out.println("endDocument()");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
/*		System.out.println("startElement()");
		switch(localName) {
		case "mother":
			System.out.println("****M" + localName);
			break;
		case "father":
			System.out.println("*****F" + localName);
			break;
		}
*/
		person = new Person();
		mother = new Mother();
		father = new Father();
		child = new Child();
		if("family".equals(localName)) {
			familyList = new ArrayList<Family>();
			int n = (Integer.parseInt(attributes.getValue("id")));
			System.out.println("----------------");
			System.out.println("|" + localName + " id = " + n + " |");
			System.out.println("----------------");
		} else if("mother".equals(localName)) {
//			person = new Mother();
			/*((Mother) person)*/mother.setMaidenName(attributes.getValue("maiden-name"));
			System.out.println(localName);
		} else if("father".equals(localName)) {
//			person = new Father();
			System.out.println(localName);
		} else if("child".equals(localName)) {
//			person = new Child();
			System.out.println(localName);
		} else {
			FamilyEnum temp = FamilyEnum.valueOf(localName.toUpperCase());
			if(withText.contains(temp)) {
				currentEnum = temp;
			}
			
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
//		System.out.println("endElement");
		if("family".equals(localName)) {
			familySet.add(familyList);
		}
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
//		System.out.println("characters: " + new StringBuilder().append(characters, start, length));
		String s = new String(ch, start, length).trim();
		if(currentEnum != null) {
			switch(currentEnum) {
			case NAME:
				person.setName(s);	
				System.out.println("name: " + s);
				break;
			case SURNAME:
				person.setSurname(s);
				System.out.println("surname: " + s);
				break;	
			case AGE:
				person.setAge(Integer.parseInt(s));
				System.out.println("age: " + s);
				break;
			case MILITARY:
				father.setMilitary(s);
				System.out.println("military: " + s);
				break;
			case GENDER:
				child.setGender(s);
				System.out.println("gender: " + s);
				break;
				default:
					throw new EnumConstantNotPresentException(currentEnum.getDeclaringClass(), currentEnum.name());
			}
//			System.out.println("characters: " + new StringBuilder().append(ch, start, length));
		}
		currentEnum = null;
	}
	
	public void printFamily(Set<List<Family>> familySet) {
		for(int i = 0; i < familySet.size(); i++) {
			System.out.println(familySet.toString());
		}
	}

}
