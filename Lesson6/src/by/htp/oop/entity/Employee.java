package by.htp.oop.entity;

public class Employee extends Person{
	
	private int experience;

	@Override
	public void doSmth() {
		System.out.println("Work experience: " + experience);
	}
	
	public void sleep() {
		System.out.println("Sleep for 6h");
	}
	
//	public void eat() {
//		System.out.println("Employee eats several gr of food today...");
//	}

}
