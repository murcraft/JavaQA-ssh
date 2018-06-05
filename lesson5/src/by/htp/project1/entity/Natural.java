package by.htp.project1.entity;

public class Natural extends Flower{
	private String periodOfBloom;
	private boolean isPlantField;
	
	public Natural() {
		super();
	}
	
	public Natural(String name, int cost, String markFresh, double lengthStem, String color, String periodOfBloom, boolean isPlantField) {
		super(name, cost, markFresh, lengthStem, color);
		this.periodOfBloom = periodOfBloom;
		this.isPlantField = isPlantField;
	}
	
	public String isPlantField() {
		if(isPlantField == true) {
			return "grows in the fields";
		} else {
			return "grows in the forest";
		}
	}
	
	public String toString() {
		return name + ", " + getLengthStem() + " cm, " + color + " color, " + "cut off date: " + 
				markFresh + ", " + isAccessories() + ", cost: " + cost + "$, period of bloom: " + periodOfBloom + ", " + isPlantField() + ".";
	}

}
