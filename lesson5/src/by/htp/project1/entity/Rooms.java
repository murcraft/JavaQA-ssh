package by.htp.project1.entity;

public class Rooms extends Flower{
	private boolean isLoveDark;
	private boolean isLoveWater;
	
	public Rooms() {
		super();
	}
	
	public Rooms(String name, int cost, String markFresh, double lengthStem, String color, boolean isLoveDark, boolean isLoveWater) {
		super(name, cost, markFresh, lengthStem, color);
		this.isLoveDark = isLoveDark;
		this.isLoveWater = isLoveWater; 
	}
	
	public String getIsLoveDark() {
		if(isLoveDark == true) {
			return "love dark";
		} else {
			return "love shine";
		}
	}
	
	public String getIsLoveWater() {
		if(isLoveWater == true) {
			return "love water";
		} else {
			return "doesn't love water";
		}
	}
	
	public String toString() {
		return name + ", " + getLengthStem()  + " cm, " + color + " color, cut off date: " +
				markFresh + ", " + isAccessories() + ", price per unit: " + cost + "$, " + getIsLoveDark() + ", " + getIsLoveWater() + ".";
	}


}
