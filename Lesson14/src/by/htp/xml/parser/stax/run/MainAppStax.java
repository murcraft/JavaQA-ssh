package by.htp.xml.parser.stax.run;

import by.htp.xml.parser.FamilyParser;
import by.htp.xml.parser.sax.FamilySaxParser;
import by.htp.xml.parser.stax.entity.FamilyStaxBuilder;

public class MainAppStax {

	public static void main(String[] args) {
		
		String path = "resources/family.xml";
		
		FamilyStaxBuilder staxBuilder = new FamilyStaxBuilder();
		staxBuilder.buildSetFamilies(path);
		System.out.println(staxBuilder.getFamilies());


	}

}
