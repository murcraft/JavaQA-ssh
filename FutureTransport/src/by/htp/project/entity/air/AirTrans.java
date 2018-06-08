package by.htp.project.entity.air;

import by.htp.project.entity.PassengerTrans;
import by.htp.project.entity.addtables.StopPoint;

public class AirTrans extends PassengerTrans{
	
	protected double maxHgtAltitude;

	public AirTrans() {
		
	}
	
	public AirTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, StopPoint endingStop, double maxHgtAltitude) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop);
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
	

}
