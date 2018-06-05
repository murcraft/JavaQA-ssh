package by.htp.project1.entity;

public class Accessories extends BouquetPart{
	private String colorRibbon;
	private String lengthRibbon;
	private boolean isBlaudy;
	
	
	public Accessories() {
		super();
	}
	
	public Accessories(String colorRibbon, String lengthRibbon, boolean isBlaudy) {
		this.colorRibbon = colorRibbon;
		this.lengthRibbon = lengthRibbon;
		this.isBlaudy = isBlaudy;
	}
	
	public String getColorRibbon() {
		return colorRibbon;
	}
	public void setColorRibbon(String colorRibbon) {
		this.colorRibbon = colorRibbon;
	}
	public String getLengthRibbon() {
		return lengthRibbon;
	}
	public void setLengthRibbon(String lengthRibbon) {
		this.lengthRibbon = lengthRibbon;
	}
	public boolean isBlaudy() {
		return isBlaudy;
	}
	public void setBlaudy(boolean isBlaudy) {
		this.isBlaudy = isBlaudy;
	}
	
	public String toString() {
		return "Color : " + getColorRibbon() + ", length: " + getLengthRibbon() + ", " + isBlaudy() + " " + this.cost;
	}

}
