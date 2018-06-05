package by.htp.project1.entity;

public class Flower extends BouquetPart{
	private double lengthStem;
	protected String color;
	protected String markFresh;
	protected boolean isAccessories;
	
	public Flower() {
		super();
	}
	
	public Flower(String name, int cost, String markFresh, double lengthStem, String color) {
		super(name, cost);
		this.setLengthStem(lengthStem);
		this.color = color;
		this.markFresh = markFresh;
		this.cost = cost;
	}
	
	public double getLengthStem() {
		return lengthStem;
	}

	public void setLengthStem(double lengthStem) {
		this.lengthStem = lengthStem;
	}
	
	public String markFresh() {
		return this.markFresh;
	}

	public String isAccessories() {
		if(isAccessories == true) {
			return "has accessories";
		} else {
			return "hasn't accessories";
		}
	}
	
	public String toString() {
		return name + ", " + getLengthStem() + " cm, " + color + " color, " + "cut off date: " + 
				markFresh + ", " + isAccessories() + ", cost: " + cost + "$.";
	}

}
