package by.htp.project1.entity;

public class BouquetPart {
	protected String name;
	protected int cost;
	
	public BouquetPart() {
		super();
	}
	
	public BouquetPart(String name, int cost) {
		this.name = name;
		this.cost = cost;
		
	}
	
	public int getCost() {
		return this.cost;
	}

}
