package by.htp.project1.entity;

public class Clumbs extends Flower{
	private boolean isPlanEveryYear;
	
	public Clumbs() {
		super();
	}
	
	public Clumbs(boolean isPlanEveryYear) {
		this.setPlanEveryYear(isPlanEveryYear);
	}

	public boolean isPlanEveryYear() {
		return isPlanEveryYear;
	}

	public void setPlanEveryYear(boolean isPlanEveryYear) {
		this.isPlanEveryYear = isPlanEveryYear;
	}

	@Override
	public String toString() {
		return "Clumbs name: " + name + ", length: " + lengthStem + ", color: " + color + ", value of fresh: " + markFresh + isAssesority + ", cost" + cost + isPlanEveryYear;
	}
	

}
