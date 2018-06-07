package by.htp.project.entity;

public class PassengerTrans extends Transport {
	
	protected int fare;
	protected int capacityOfPeople;

	public PassengerTrans() {

	}
	
	public PassengerTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, String initialStop, String endingStop) {
		super(name, cost, speedUp, constructSpeed, productionDate, initialStop, endingStop);
		this.fare = fare;
		this.capacityOfPeople = capacityOfPeople;	
	}
	
	
	public String toString() {
		return "[" + name + "] cost for one unit: " + cost + "$, " + "fare = " + fare + "$, " + "speedup is " + speedUp + ", construction speed = " + constructSpeed + ". Is prodused in " + productionDate +
				", capacity is " + capacityOfPeople + " people. Leave from: " + initialStop + ", depart to " + endingStop;
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
