package by.htp.xml.parser.dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.htp.xml.entity.Families;
import by.htp.xml.entity.Family;
import by.htp.xml.parser.FamilyParser;

public class FamilyDomParser implements FamilyParser {
	
	public Families parseFamilyDoc(String path) {
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance(); //можно создавать только один раз синглтон, new не пишем ротому что конструктор закрыт
		
		try {
			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(path);
			
			Element element = document.getDocumentElement();
			System.out.println("Document element: " + element.getTagName());
			
			List<Family> families = new ArrayList<Family>();
			
			NodeList childNodes = element.getElementsByTagName("family");
			Family family = null;
			
			
			for (int i = 0; i < childNodes.getLength(); i++) {
				family = new Family();
//				Node node = childNodes.item(i);
				Element node1 = (Element)childNodes.item(i);
				Element mother =  (Element)node1.getElementsByTagName("mother").item(i);
				
				System.out.println("Node: " + ((Element)node1).getTagName() + " " + mother);
				
			}
			
//			for (int i = 0; i < studentsList.getLength(); i++) {
//				Element studentElement = (Element) studentsList.item(i);
//				Student student = buildStudent(studentElement);
//				students.add(student);
//				}
			
		/*	NodeList motherNodes = element.getElementsByTagName("mother");
			for (int i = 0; i < motherNodes.getLength(); i++) {
				Node node = motherNodes.item(i);
				System.out.println("Node: " + ((Element)node).getTagName());
			
			}
			
			NodeList fatherNodes = element.getElementsByTagName("father");
			for (int i = 0; i < fatherNodes.getLength(); i++) {
				Node node = fatherNodes.item(i);
				System.out.println("Node: " + ((Element)node).getTagName());
			
			}
			
			NodeList childrenNodes = element.getElementsByTagName("child");
			for (int i = 0; i < childrenNodes.getLength(); i++) {
				Node node = childrenNodes.item(i);
				System.out.println("Node child: " + ((Element)node).getTagName());
			}
			*/
		
			
			System.out.println();
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
