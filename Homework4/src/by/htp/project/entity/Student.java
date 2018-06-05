package by.htp.project.entity;

public class Student extends Person{
	private double avrMark;
	
	public Student() {
		super("Igor"); // должны сами писать, если нет в родителе пустого конструктора
		//super();
		System.out.println("Student()");
	}
	
	public Student(String name, double avrMark) {
		this(); // обращение к своему собственному констуктору
		System.out.println("Student(String name, double avrMark)");
		//this.name = name;
		this.avrMark = avrMark;
	}


	//alt+shift+command
	@Override
	public String toString() {
		return "name: " + name + ", avg: " + avrMark;
	}
	
	
}
