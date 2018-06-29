package by.htp.xml.parser.dom.run;

import by.htp.xml.parser.dom.FamilyDomParser;

public class MainAppDom {

	public static void main(String[] args) {


		String path = "resources/family.xml";
		
		FamilyDomParser domParser = new FamilyDomParser();
		domParser.parseFamilyDoc(path);
		System.out.println(domParser.getFamilies());

	}

}
