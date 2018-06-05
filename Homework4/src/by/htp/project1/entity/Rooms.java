package by.htp.project1.entity;

public class Rooms extends Flower{
	private boolean isLoveDark;
	private boolean isLoveWater;
	
	public Rooms() {
		super();
	}
	
	public Rooms(boolean isLoveDark, boolean isLoveWater) {
		this.isLoveDark = isLoveDark;
		this.isLoveWater = isLoveWater; 
	}
	
	public String toString() {
		return "Clumbs name: " + name + ", length: " + lengthStem + ", color: " + color + ", value of fresh: " + markFresh + isAssesority + ", cost" + cost + isLoveDark + isLoveWater;
	}


}
