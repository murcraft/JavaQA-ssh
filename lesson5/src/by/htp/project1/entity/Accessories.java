package by.htp.project1.entity;

public class Accessories extends BouquetPart{
	private String colorRibbon;
	private double lengthRibbon;
	private boolean isBrilliant;
	
	
	public Accessories() {
		super();
	}
	
	public Accessories(String name, int cost, String colorRibbon, double lengthRibbon, boolean isBlaudy) {
		super(name, cost);
		this.colorRibbon = colorRibbon;
		this.lengthRibbon = lengthRibbon;
		this.isBrilliant = isBlaudy;
	}
	
	public String getColorRibbon() {
		return colorRibbon;
	}
	public void setColorRibbon(String colorRibbon) {
		this.colorRibbon = colorRibbon;
	}
	public double getLengthRibbon() {
		return lengthRibbon;
	}
	public void setLengthRibbon(double lengthRibbon) {
		this.lengthRibbon = lengthRibbon;
	}
	public boolean isBrilliant() {
		return isBrilliant;
	}
	public void setIsBrilliant(boolean isBlaudy) {
		this.isBrilliant = isBlaudy;
	}
	
	public String getIsBlaudy() {
		if(isBrilliant() == true) {
			return "has spangles";
		} else {
			return "hasn't spangles";
		}
	}	
	
	public String toString() {
		return this.name + ", " + getColorRibbon() + ", " + this.cost + "$, " + getLengthRibbon() + " cm, " + getIsBlaudy() + ".";
	}

}
