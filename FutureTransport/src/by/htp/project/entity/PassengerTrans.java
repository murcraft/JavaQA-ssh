package by.htp.project.entity;

import by.htp.project.entity.points.StopPoint;

public class PassengerTrans extends Transport {
	
	protected int fare;
	protected int capacityOfPeople;

	public PassengerTrans() {

	}
	
	public PassengerTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop) {
		super(name, cost, speedUp, constructSpeed, productionDate, initialStop);
		this.fare = fare;
		this.capacityOfPeople = capacityOfPeople;	
	}
	
	public String toString() {
		return name + " | cost: " + cost + "$, " + "fare = " + fare + "$, " + "speedup is " + speedUp + " m/s2, constr. speed = " + constructSpeed + " m/s. Is produced in " + productionDate +
				", capacity is " + capacityOfPeople + " people. Rout: " + initialStop + ".";
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getFare() {
		return this.fare;
	}

	public int getCost() {
		return this.cost;
	}
	
	@Override
	public boolean isStartMovie() {
		return false;
	}

	@Override
	public boolean isEndMovie() {
		return false;
	}

	@Override
	public boolean isMovie() {
		return false;
	}
}
