package by.htp.project.entity.undeground;

import by.htp.project.entity.addtables.StopPoint;

public class SpeedSubway extends UndegroundTrans{
	
	private double limitLength;

	public SpeedSubway() {
		super();
	}

	public SpeedSubway(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, StopPoint endingStop, double widthOfRail, double limitLength) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop, widthOfRail);
		this.setLimitLength(limitLength);
	}

	public double getLimitLength() {
		return limitLength;
	}

	public void setLimitLength(double limitLength) {
		this.limitLength = limitLength;
	}
	

}
