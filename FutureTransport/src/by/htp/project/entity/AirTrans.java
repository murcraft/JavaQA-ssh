package by.htp.project.entity;

import by.htp.project.entity.addtables.StopPoint;

public class AirTrans extends PassengerTrans{
	
	protected double maxHgtAltitude;

	public AirTrans() {
		
	}
	
	public AirTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, double maxHgtAltitude) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop);
		this.setMaxHgtAltitude(maxHgtAltitude);
	}
	
	public double getMaxHgtAltitude() {
		return maxHgtAltitude;
	}

	public void setMaxHgtAltitude(double maxHgtAltitude) {
		this.maxHgtAltitude = maxHgtAltitude;
	}
	
	public void fly() {
		System.out.println("Flying");
	}

	public boolean isStartMovie() {
		return false;
	};
	
	public boolean isEndMovie() {
		return false;
	};
	
	public boolean isStopped() {
		return false;
	};
	
	public String toString() {
		return name + " | cost: " + cost + "$, " + "fare = " + fare + "$, " + "speedup is " + speedUp + " m/s2, constr. speed = " + constructSpeed + " m/s. Is produced in " + productionDate +
				", capacity is " + capacityOfPeople + " people, max hight: " + maxHgtAltitude + ". Rout: " + initialStop + ".";
	}

}
