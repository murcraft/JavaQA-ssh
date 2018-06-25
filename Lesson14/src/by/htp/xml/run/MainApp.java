package by.htp.xml.run;

import by.htp.xml.parser.FamilyParser;
import by.htp.xml.parser.dom.FamilyDomParser;

public class MainApp {

	public static void main(String[] args) {
	
		FamilyParser familyParser = new FamilyDomParser();		//new FamilySaxParser();
		// делаем интерфейс FamilyParser и тогда можем создавать оъекты типа интерфейса
		familyParser.parseFamilyDoc("resources/family.xml");
	

	}

}
