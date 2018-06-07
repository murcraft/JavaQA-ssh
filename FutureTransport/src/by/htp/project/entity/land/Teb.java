package by.htp.project.entity.land;

public class Teb extends LandTrans {
	
	private boolean isMissedThrough;
	
	public Teb() {
		super();
	}

	public Teb(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, String itialStop, String endingStop, boolean isWheeled, boolean isMissedThrough) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop, endingStop, isWheeled);
		this.setMissedThrough(true);
	}

	public boolean isMissedThrough() {
		return isMissedThrough;
	}

	public void setMissedThrough(boolean isMissedThrough) {
		this.isMissedThrough = isMissedThrough;
	}

}
