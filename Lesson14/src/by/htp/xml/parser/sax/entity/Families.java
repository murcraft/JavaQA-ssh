package by.htp.xml.parser.sax.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Families {
	
	private List<Family> list = new ArrayList<Family>();

	public Families() {
		super();
	}

	public Families(ArrayList<Family> list) {
		super();
		this.list = list;
	}
	
	public boolean add(Family family) {
		return list.add(family);
	}

	@Override
	public String toString() {
		return "Families " + list + " ";
	}
	
	

}
