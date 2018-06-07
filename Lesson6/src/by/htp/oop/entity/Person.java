package by.htp.oop.entity;

public abstract class Person {
	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public abstract void doSmth();
	
	public void eat() {
		System.out.println("Person eats several gr of food...");
	}
	
	

}
