package by.htp.project.entity;

public class Person {
	protected String name;
	
	public Person(String name) {
		
		System.out.println("Person(String name)");
		this.name = name;
	}
	
	public Person() {
		super();
		System.out.println("Person()");
		
	}
	


}
