package by.htp.xml.parser.sax.entity;

public class Child extends Person {
	
	private String gender;

	public Child() {
		super();
	}

	public Child(String name, String surname, int age) {
		super(name, surname, age);
	}

	public Child(String name, String surname, int age, String gender) {
		super(name, surname, age);
		this.setGender(gender);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return getName() + " " + getSurname() + ", age: " + getAge() + gender + " ";
	}
	
	
	

}
