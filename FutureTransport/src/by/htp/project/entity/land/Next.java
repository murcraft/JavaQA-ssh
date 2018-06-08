package by.htp.project.entity.land;

import by.htp.project.entity.addtables.StopPoint;

public class Next extends LandTrans{
	private boolean isSelfDriven;
	private int wheelAmount;
	
	public Next() {
		
	}
	
	public Next(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, StopPoint itialStop, StopPoint endingStop, boolean isWheeled, boolean isSelfDriven, int wheelAmount) {
			super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop, endingStop, isWheeled);
			this.setSelfDriven(isSelfDriven);
			this.setWheelAmount(wheelAmount);
	}

	public boolean isSelfDriven() {
		return isSelfDriven;
	}

	public void setSelfDriven(boolean isSelfDriven) {
		this.isSelfDriven = isSelfDriven;
	}

	public int getWheelAmount() {
		return wheelAmount;
	}

	public void setWheelAmount(int wheelAmount) {
		this.wheelAmount = wheelAmount;
	}

}
