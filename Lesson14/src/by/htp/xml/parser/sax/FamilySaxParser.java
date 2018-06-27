package by.htp.xml.parser.sax;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.xml.entity.Families;
import by.htp.xml.parser.FamilyParser;
import by.htp.xml.parser.sax.entity.Family;

public class FamilySaxParser implements FamilyParser {
	
	private Set<List<Family>> familySet;
	private List<Family> familyList;
	private FamilySaxHandler fh = new FamilySaxHandler();
	

	public Families parseFamilyDoc(String path) {
		
		try {
		XMLReader reader = XMLReaderFactory.createXMLReader();
		reader.setContentHandler(fh); 
		reader.parse(path);
	
			
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Set<List<Family>> getFamilySet() {
		return familySet;
	}

	public void setFamilySet(Set<List<Family>> familySet) {
		this.familySet = familySet;
	}

	public List<Family> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(List<Family> familyList) {
		this.familyList = familyList;
	}

	@Override
	public String toString() {
		return "FamilySaxParser [familySet=" + familySet + ", familyList=" + familyList + ", fh=" + fh + "]";
	}

	
}
