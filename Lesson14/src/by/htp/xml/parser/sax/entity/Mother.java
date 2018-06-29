package by.htp.xml.parser.sax.entity;

public class Mother extends Person {
	
	private String maidenName = null;
	
	public Mother() {
		super();
	}

	public Mother(String name, String surname, int age) {
		super(name, surname, age);
	}

	public Mother(String name, String surname, int age, String maidenName) {
		super(name, surname, age);
		this.maidenName = maidenName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	@Override
	public String toString() {
		return "" + maidenName + " -Mname, " +  getName() + " " + getSurname() + ", age: " + getAge();
	}
	
	
	

}
