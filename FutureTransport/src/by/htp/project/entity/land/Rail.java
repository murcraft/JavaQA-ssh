package by.htp.project.entity.land;

import by.htp.project.entity.addtables.StopPoint;

public class Rail extends LandTrans {
	
	private double limitLength;
	private double widthOfRail;

	public Rail() {
		super();
	}

	public Rail(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, StopPoint itialStop, StopPoint endingStop, boolean isWheeled, double limitLength, double widthOfRail) {
			super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop, endingStop, isWheeled);
			this.setLimitLength(limitLength);
			this.setWidthOfRail(widthOfRail);
	}

	public double getLimitLength() {
		return limitLength;
	}

	public void setLimitLength(double limitLength) {
		this.limitLength = limitLength;
	}

	public double getWidthOfRail() {
		return widthOfRail;
	}

	public void setWidthOfRail(double widthOfRail) {
		this.widthOfRail = widthOfRail;
	}

}
