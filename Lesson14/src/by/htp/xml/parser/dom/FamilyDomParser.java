package by.htp.xml.parser.dom;

import java.io.IOException;
import java.util.ArrayList;
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

	private Set<Family> families;
	
	public FamilyDomParser() {
		this.families  = new HashSet<Family>();
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance(); //можно создавать только один раз синглтон, new не пишем ротому что конструктор закрыт
		try {
			documentBuilder = builderFactory.newDocumentBuilder();
		} catch(ParserConfigurationException e) {
			System.out.println("Configuration error of parser: " + e);
		}
	}
	
	public Set<Family> getFamilies() {
		return families;
	}

	public void setFamilies(Set<Family> families) {
		this.families = families;
	}
	
	public Families parseFamilyDoc(String path) {
		Document document = null;
		
		try {
			// создание DOM-анализатора
			document = documentBuilder.parse(path);
//			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
						
			Element root = document.getDocumentElement();
			System.out.println("Document root: " + root.getTagName());
			
			// получение списка дочерних элементов
			NodeList childNodes = root.getElementsByTagName("family");
			
			for (int i = 0; i < childNodes.getLength(); i++) {

				Element familyElem = (Element)childNodes.item(i);
				
//				NodeList childMin = familyElem.getElementsByTagName("mother");
//				System.out.println(childMin.toString());
//				
//				NodeList childFath = familyElem.getElementsByTagName("father");
//				System.out.println(childFath.toString());
				
				Family family = buildFamily(familyElem);
				families.add(family);
			}

	
			/*	
				Node node = childNodes.item(i);
				if(node.getNodeType() != Node.TEXT_NODE) {
					NodeList mothers = node.getChildNodes();
					for(int j = 0; j < mothers.getLength(); j++) {
						Node motherEl = mothers.item(j);
						if(motherEl.getNodeType() != Node.TEXT_NODE) {
							NodeList children = node.getChildNodes();
//							System.out.println(motherEl.getNodeName() + ");// : " + motherEl.getChildNodes().item(0).getTextContent());
						for(int k = 0; k < children.getLength(); k++) {
							Node child = mothers.item(k);
							if(child.getNodeType() != Node.TEXT_NODE) {
								System.out.println( child.getNodeName() + " : " + child.getChildNodes().item(0).getTextContent());
							}
						}

						}
					}
					System.out.println("======================>");
				}
			}
		*/	
			
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
		return null;
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

