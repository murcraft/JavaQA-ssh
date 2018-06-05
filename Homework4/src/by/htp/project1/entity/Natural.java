package by.htp.project1.entity;

public class Natural extends Flower{
	private String periodOfBloom;
	private boolean isPlantField;
	
	public Natural() {
		super("Pion", 40, "red", "01.06.2018", 10);
	}
	
	public Natural(String periodOfBloom, boolean isPlantField) {
		this();
		this.periodOfBloom = periodOfBloom;
		this.isPlantField = isPlantField;
	}
	
	public String toString() {
		return "Clumbs name: " + name + ", length: " + lengthStem + ", color: " + color + ", value of fresh: " + markFresh + isAssesority + ", cost" + cost + periodOfBloom + isPlantField;
	}

}
