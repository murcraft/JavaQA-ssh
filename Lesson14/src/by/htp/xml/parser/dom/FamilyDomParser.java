package by.htp.xml.parser.dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.htp.xml.entity.Child;
import by.htp.xml.entity.Families;
import by.htp.xml.entity.Family;
import by.htp.xml.entity.Father;
import by.htp.xml.entity.Mother;
import by.htp.xml.entity.Person;
import by.htp.xml.parser.FamilyParser;

public class FamilyDomParser /*implements FamilyParser*/ {
	
	private DocumentBuilder documentBuilder;

	private List<Family> families;
	
	public FamilyDomParser() {
		
		this.families  = new ArrayList<Family>();
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance(); //можно создавать только один раз синглтон, new не пишем ротому что конструктор закрыт
		try {
			documentBuilder = builderFactory.newDocumentBuilder();
		} catch(ParserConfigurationException e) {
			System.out.println("Configuration error of parser: " + e);
		}
	}
	
	public List<Family> getFamilies() {
		return families;
	}

	public Families parseFamilyDoc(String path) {
		Document document = null;
		
		try {
			// создание DOM-анализатора
			document = documentBuilder.parse(path);   //			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
	
			Element root = document.getDocumentElement();
			System.out.println("Document root: " + root.getTagName());

			NodeList childNodes = root.getElementsByTagName("family"); 			// получение списка дочерних элементов
			
			for (int i = 0; i < childNodes.getLength(); i++) {

				Element familyElem = (Element)childNodes.item(i);
				System.out.println(familyElem.getNodeName());
				
				initializeFamilyPersons(familyElem, "mother");
				
				initializeFamilyPersons(familyElem, "father");
				
				initializeFamilyPersons(familyElem, "children");
							
				initializeFamilyPersons(familyElem, "child");
				
				Family family = buildFamily(familyElem);
				families.add(family);
			}
		
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void initializeFamilyPersons(Element familyElem, String elementName) {
		
		NodeList elements = familyElem.getElementsByTagName(elementName);
		
		for(int j = 0; j < elements.getLength(); j++) {
			
			Element element = (Element)elements.item(j);
			System.out.println(" " + element.getNodeName());
			
			initialiseFamilyPersonsElements(element, "name");
			initialiseFamilyPersonsElements(element, "surname");
			initialiseFamilyPersonsElements(element, "age");
	
			if(elementName.equals("father")) {
				initialiseFamilyPersonsElements(element, "military");
			}
			
			if(elementName.equals("child")) {
				initialiseFamilyPersonsElements(element, "gender");
			}
			
		}
	}
	
	public void initialiseFamilyPersonsElements(Element element, String value) {
		
		NodeList elementNames = element.getElementsByTagName(value);
		System.out.println("   " + elementNames.item(0).getNodeName());
	}

	
	public Family buildFamily(Element familyElem) {
		Family family = new Family();

		// заполнение объекта Family
		family.setId(Integer.parseInt(familyElem.getAttribute("id")));
		
//		Mother mother = family.getMother();
//		Element motherElement = (Element)familyElem.getElementsByTagName("mother").item(0);
//		mother.setName(getSingleChild(motherElement, "name"));
//		mother.setSurname(getSingleChild(motherElement, "surname"));
//		mother.setAge(Integer.parseInt(getSingleChild(motherElement, "age")));
		
	return family;
	}
	
	
	public static String getSingleChild(Element element, String childName) {
		NodeList nList = element.getElementsByTagName(childName);
		Node child = nList.item(0);
		String text = child.getTextContent();
		return text;
	}

}

