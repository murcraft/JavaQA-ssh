package by.htp.xml.parser.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.htp.xml.entity.Families;
import by.htp.xml.parser.FamilyParser;

public class FamilyDomParser implements FamilyParser {
	
	public Families parseFamilyDoc(String path) {
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance(); //можно создавать только один раз синглтон, new не пишем ротому что конструктор закрыт
		
		try {
			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(path);
			
			Element element = document.getDocumentElement();
			System.out.println("Document element: " + element.getTagName());
			NodeList childNodes = element.getElementsByTagName("family");
			
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node node = childNodes.item(i);
				System.out.println("Node: " + ((Element)node).getTagName());
			}
			
			System.out.println();
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
