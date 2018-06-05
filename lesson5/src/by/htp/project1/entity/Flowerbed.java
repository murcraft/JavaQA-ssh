package by.htp.project1.entity;

public class Flowerbed extends Flower{
	private boolean isPlanEveryYear;
	
	public Flowerbed() {
		super();
	}
	
	public Flowerbed(String name, int cost, String markFresh, double lengthStem, String color, boolean isPlanEveryYear) {
		super(name, cost, markFresh, lengthStem, color);
		this.setPlanEveryYear(isPlanEveryYear);
	}

	public String isPlanEveryYear() {
		if(isPlanEveryYear == true) {
			return "need plan every year";
		} else {
			return "of long standing";
		}
	}

	public void setPlanEveryYear(boolean isPlanEveryYear) {
		this.isPlanEveryYear = isPlanEveryYear;
	}

	@Override
	public String toString() {
		return name + ", " + getLengthStem() + " cm, " + color + " color, " + "cut off date: " + markFresh +
				", " + isAccessories() + ", price per unit: " + cost + "$, " + isPlanEveryYear() + ".";
	}
	

}
