package by.htp.project1.entity;

public class Flower extends BouquetPart{
	protected String name;
	protected double lengthStem;
	protected String color;
	protected String markFresh;
	protected boolean isAssesority;
	
	public Flower() {
		super();
	}
	
	public Flower(String name, double lengthStem, String color, String markFresh, int cost) {
		this.name = name;
		this.lengthStem = lengthStem;
		this.color = color;
		this.markFresh = markFresh;
		this.cost = cost;
	}

	


}
