package by.htp.project.entity;

import by.htp.project.entity.addtables.StopPoint;

public class LandTrans extends PassengerTrans {
	
	protected boolean isWheeled;
	
	public LandTrans() {
		super();
	}

	public LandTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, StopPoint itialStop, boolean isWheeled) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop);
		this.isWheeled = isWheeled;
	}


	public boolean isStartMovie() {
		return false;
	}

	public boolean isEndMovie() {
		return false;
	}

	public boolean isMovie() {
		return false;
	}
	
	public boolean isWheeled() {
		return isWheeled;
	}

	public void setWheeled(boolean isWheeled) {
		this.isWheeled = isWheeled;
	}
	
	public String getNameWheeled(boolean isWheeled) {
		if(isWheeled == true) {
			return "has wheels";
		}
		return "hasn't wheels";
	}

	public String toString() {
		return name + " | cost: " + cost + "$, " + "fare = " + fare + "$, " + "speedup is " + speedUp + " m/s2, constr. speed = " + constructSpeed + " m/s. Is produced in " + productionDate +
				", capacity is " + capacityOfPeople + " people, " + getNameWheeled(isWheeled) + ". Rout: " + initialStop + ".";
	}

}
