package by.htp.xml.entity;

import java.util.ArrayList;
import java.util.List;

public class Family {
	
	private int id;
	private Mother mother;
	private Father father;
	private List<Child> children;


	public Family() {
	}

	public Family(int id) {
		this.setId(id);
		this.mother = new Mother();
		this.father = new Father();
		this.children = new ArrayList<Child>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Family [id=" + id + ", mother=" + mother + ", father=" + father + ", children=" + children + "]";
	}

	
	
}
