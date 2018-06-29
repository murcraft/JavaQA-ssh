package by.htp.xml.parser.sax.entity;

import java.util.ArrayList;

public class Family {
	
	
	private int id;
	private Mother mother;
	private Father father;
	private Child child;
	private Person person;

	public Family() {
	}





	public Family(int id) {
		super();
		this.id = id;
		setMother(mother);
		setFather(father);
		setChild(child);

	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	



	@Override
	public String toString() {
		return "FamilyId = " + id + ", mother[" + mother + "]  father[" + father + "] child[" + child + "] ";
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}
	
	public Person getPerson() {
		return mother;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}
	
	

}
