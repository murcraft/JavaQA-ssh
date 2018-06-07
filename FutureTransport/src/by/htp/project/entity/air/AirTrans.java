package by.htp.project.entity.air;

import by.htp.project.entity.PassengerTrans;

public class AirTrans extends PassengerTrans{
	
	protected double maxHgtAltitude;

	public AirTrans() {
		
	}
	
	public AirTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, String initialStop, String endingStop, double maxHgtAltitude) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop);
		this.setMaxHgtAltitude(maxHgtAltitude);
	}
	
	public double getMaxHgtAltitude() {
		return maxHgtAltitude;
	}

	public void setMaxHgtAltitude(double maxHgtAltitude) {
		this.maxHgtAltitude = maxHgtAltitude;
	}
	
//	@Override
//	public abstract boolean isStartMovie();
//	
//	@Override
//	public abstract boolean isEndMovie();
//	
//	@Override
//	public abstract boolean isStopped();
	

}
