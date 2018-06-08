package by.htp.project.entity.land;

import by.htp.project.entity.addtables.StopPoint;

public class Teb extends LandTrans {
	
	private boolean isMissedThrough;
	
	public Teb() {
		super();
	}

	public Teb(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, StopPoint itialStop, StopPoint endingStop, boolean isWheeled, boolean isMissedThrough) {
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
