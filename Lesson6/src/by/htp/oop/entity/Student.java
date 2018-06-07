package by.htp.oop.entity;

public class Student extends Person{
	private double avgMark;
	
	@Override
	public void doSmth() {
		System.out.println("Study with avgMark: " + avgMark);
	}
	
	public void sleep() {
		System.out.println("Student sleeps for 12h");
	}
	
	@Override
	public void eat() {
		System.out.println("Student ate several gr of food 3 days ago...");
	}

}
