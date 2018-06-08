package by.htp.project.entity.land;

import by.htp.project.entity.addtables.StopPoint;

public class Scarab extends LandTrans {
	
	private boolean isMobile;

	public Scarab() {
		super();
	}

	public Scarab(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, StopPoint itialStop, StopPoint endingStop, boolean isWheeled, boolean isMobile) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop, endingStop, isWheeled);
		this.setMobile(isMobile);
		
	}

	public boolean isMobile() {
		return isMobile;
	}

	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}
	

}
