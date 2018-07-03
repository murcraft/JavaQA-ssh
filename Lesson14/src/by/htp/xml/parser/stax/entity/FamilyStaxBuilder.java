package by.htp.xml.parser.stax.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import by.htp.xml.entity.Child;
import by.htp.xml.entity.Family;
import by.htp.xml.entity.Father;
import by.htp.xml.entity.Mother;
import by.htp.xml.entity.Person;
import by.htp.xml.parser.sax.entity.FamilyEnum;

public class FamilyStaxBuilder {
	
	private List<Family> families = new ArrayList<>();;
	private XMLInputFactory inputFactory;
	private Family fam = null;
	private Mother mother = null;
	private Father father = null;
	private Child child = null;
	private Person person = null;
	
	public FamilyStaxBuilder() {
		inputFactory = XMLInputFactory.newInstance();
	}

	public List<Family> getFamilies() {
		return families;
	}

	public void buildSetFamilies(String path) {
		FileInputStream inputStream = null;
		XMLStreamReader reader = null;
		String name;
		FamilyEnum elementName = null;
		try {
			inputStream = new FileInputStream(new File(path));
			reader = inputFactory.createXMLStreamReader(inputStream);
			
			//StaX parsing
			while(reader.hasNext()) {
				int type = reader.next();
//				System.out.println(type);
				switch(type) {
				case XMLStreamConstants.START_ELEMENT:
			
					name = reader.getLocalName();
//					System.out.println(name);
					
					switch(name) {
					case "family":
						System.out.print(name);
						fam = new Family();
						fam.setId(Integer.parseInt(reader.getAttributeValue(0)));
						System.out.println(" id = " + fam.getId());
						
					break;
					
					case "mother":
						System.out.println("I found MOTHER");
						System.out.println(name);
						mother = getXMLMother(reader);
						break;
					
					
					case "father":
						System.out.println("I found FATHER");
						System.out.println(name);
						father = getXMLFather(reader);
				
						break;	

					case "child":
						System.out.println("I found CHILD");
						System.out.println(name);
						child = getXMLChild(reader);
						
						break;
					}
					
				
				break;
				
				case XMLStreamConstants.END_ELEMENT:
					name = reader.getLocalName();
					switch(name) {
			
					case "family":
						families.add(fam);
						break;
					}
				break;
			
				}
			}
		} catch (XMLStreamException ex) {
			System.err.println("Stax parsing error! " + ex.getMessage());
		} catch (FileNotFoundException ex) {
			System.err.println("File " + path + " not found! " + ex);
		} finally {
			try {
				if(inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				System.err.println("Impossible close file " + path + " : " + e);
			}
		}
	}

	private Mother getXMLMother(XMLStreamReader reader) throws XMLStreamException {
		mother = new Mother();
		mother.setMaidenName(reader.getAttributeValue(0));
		System.out.println("maiden name: " + mother.getMaidenName());
		String value;
		while(reader.hasNext()) {
			int typeM = reader.next();
			
			if(typeM == XMLStreamConstants.START_ELEMENT) {
				value = reader.getLocalName();
				System.out.println("value" + value);
				
				switch(value) {
//				case "mother":
//					mother.setMaidenName(reader.getAttributeValue(0));
//					System.out.println("maiden name: " + mother.getMaidenName());
//				break;	
					
				case "name":
					System.out.println(value);
					mother.setSurname(getXMLText(reader));
					System.out.println(mother.getSurname());
				break;	
				
				case "surname":
					System.out.println(value);
					mother.setName(getXMLText(reader));
					System.out.println(mother.getName());
				break;

				case "age":
					System.out.println(value);
					mother.setAge(Integer.parseInt(getXMLText(reader)));
					System.out.println(mother.getAge());
				break;	
				default:
					System.out.println("Unknown");
				break;
				}
			
			}
			
		if(typeM == XMLStreamConstants.END_ELEMENT) { 
				value = reader.getLocalName();
				
				if(value.equals("mother")) {
					System.out.println("ENDDDDDDDDDDDDDDDDD");
					fam.setMother(mother);
					System.out.println(fam);
					return mother;
				}
				
		}
	}
		
	throw new XMLStreamException("Unknown element in tag Mother");
	}
	
	private Father getXMLFather(XMLStreamReader reader) throws XMLStreamException {
		father = new Father();
		
		String valueF;
		while(reader.hasNext()) {
			int typeF = reader.next();
			
			if(typeF == XMLStreamConstants.START_ELEMENT) {
				valueF = reader.getLocalName();
				
				switch(valueF) {
//				case "father":
//					
//					System.out.println(father);
					
				case "name":
					System.out.println(valueF);
					father.setName(getXMLText(reader));
					System.out.println(father.getName());
					break;	
					
				case "surname":
					System.out.println(valueF);
					father.setSurname(getXMLText(reader));
					System.out.println(father.getSurname());
					break;	

				case "age":
					System.out.println(valueF);
					father.setAge(Integer.parseInt(getXMLText(reader)));
					System.out.println(father.getAge());
					break;	
				case "military":
					System.out.println(valueF);
					father.setMilitary(valueF);
					System.out.println(father.getMilitary());
					break;		
				}
			}
			
			if(typeF == XMLStreamConstants.END_ELEMENT) { 
				valueF = reader.getLocalName();
				
				if(valueF.equals("father")) {
					System.out.println("ENDDDDDDDDDDDDDDDD        FATHER");
					fam.setFather(father);
					System.out.println(fam);
					return father;
				}
			}
		}
		
		throw new XMLStreamException("Unknown element in tag Father");
	}

	private Child getXMLChild(XMLStreamReader reader) throws XMLStreamException {

		child = new Child();

		String valueC;
		while(reader.hasNext()) {
			int typeM = reader.next();
			
			if(typeM == XMLStreamConstants.START_ELEMENT) {
				
				valueC = reader.getLocalName();
				
				switch(valueC) {
				
				case "surname":
					System.out.println(valueC);
					child.setName(getXMLText(reader));
					System.out.println(child.getName());
					break;	
					
				case "name":
					System.out.println(valueC);
					child.setSurname(getXMLText(reader));
					System.out.println(child.getSurname());
					break;	

				case "age":
					System.out.println(valueC);
					child.setAge(Integer.parseInt(getXMLText(reader)));
					System.out.println(child.getAge());
					break;	
				case "gender":
					System.out.println(valueC);
					child.setGender(valueC);
					System.out.println(child.getGender());
					break;		
				}
			}	
			
			if(typeM == XMLStreamConstants.END_ELEMENT) {
				valueC = reader.getLocalName();
				
				if(valueC.equals("child")) {
					System.out.println("ENDDDDDDDDDDDDDDDDDDD    CHILD");
					fam.setChild(child);
					System.out.println(fam);
					return child;
				}
			}
		}
		throw new XMLStreamException("Unknown element in tag Child");
	}
	
	private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
		String text = null;
		if(reader.hasNext()) {
			reader.next();
			text = reader.getText();
		}
		return text;
	}
	

}
