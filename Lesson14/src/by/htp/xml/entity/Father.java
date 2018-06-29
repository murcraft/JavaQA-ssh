package by.htp.xml.entity;

public class Father extends Person  {
private String military;
	
	public Father() {
		super();
	}

	public Father(String name, String surname, int age) {
		super(name, surname, age);
	}

	public Father(String name, String surname, int age, String military) {
		super(name, surname, age);
		this.setMilitary(military);
	}

	public String isMilitary() {
		return military;
	}

	public void setMilitary(String military) {
		this.military = military;
	}
	

}
