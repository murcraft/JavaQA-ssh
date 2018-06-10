package by.htp.project.entity;

import by.htp.project.entity.addtables.StopPoint;

public class UndegroundTrans extends PassengerTrans {
	
	protected double widthOfRail;
	

	public UndegroundTrans() {
		super();
	}

	public UndegroundTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, double widthOfRail) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop);
		this.widthOfRail = widthOfRail;
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
	
	public String toString() {
		return name + " | cost: " + cost + "$, " + "fare = " + fare + "$, " + "speedup is " + speedUp + " m/s2, constr. speed = " + constructSpeed + " m/s. Is produced in " + productionDate +
				", capacity is " + capacityOfPeople + " people, width of rails: " + widthOfRail + ". Rout: " + initialStop + ".";
	}
}
