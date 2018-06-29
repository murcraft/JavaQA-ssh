package by.htp.xml.run;

import by.htp.xml.parser.FamilyParser;
import by.htp.xml.parser.dom.FamilyDomParser;
import by.htp.xml.parser.sax.FamilySaxParser;
import by.htp.xml.parser.sax.entity.Families;
import by.htp.xml.parser.sax.entity.Family;

public class MainApp {

	public static void main(String[] args) {
		String path = "resources/family.xml";
	
		FamilyParser familyParser = new FamilySaxParser();//new FamilyDomParser();	/
		// делаем интерфейс FamilyParser и тогда можем создавать оъекты типа интерфейса
		familyParser.parseFamilyDoc(path);
//		familyParser.
		
/*		FamilyDomParser domParser = new FamilyDomParser();
		domParser.parseFamilyDoc(path);
		System.out.println(domParser.getFamilies());
		*/

	}

}
