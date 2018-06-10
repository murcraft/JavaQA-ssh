package by.htp.project.entity;

import by.htp.project.entity.addtables.StopPoint;

public abstract class Transport {
	protected String name;
	protected int cost;
	protected double speedUp;
	protected double constructSpeed;
	protected String productionDate;
	protected StopPoint initialStop;
	
	public Transport() {
		
	}
	
	public Transport(String name, int cost, double speedUp, double constructSpeed, String productionDate,  StopPoint initialStop) {
		this.name = name;
		this.cost = cost;
		this.speedUp = speedUp;
		this.constructSpeed = constructSpeed;
		this.productionDate = productionDate;
		this.initialStop = initialStop;
	}
	
	public abstract boolean isStartMovie();
	
	public abstract boolean isEndMovie();
	
	public abstract boolean isMovie();
	
	public double getConstructSpeed() {
		return constructSpeed;
	}

	public void setConstructSpeed(double constructSpeed) {
		this.constructSpeed = constructSpeed;
	}
	
	public double getSpeedUp() {
		return speedUp;
	}
	
	public double getTime(double dist) {
		return Math.sqrt(dist / getSpeedUp());
	}

	public void setSpeedUp(double speedUp) {
		this.speedUp = speedUp;
	}

	public StopPoint getInitialStop() {
		return initialStop;
	}

	public void setInitialStop(StopPoint initialStop) {
		this.initialStop = initialStop;
	}

	public String toString() {
		return name + " | cost: " + cost + ", speed up: " + speedUp + ", construct speed: " + constructSpeed + ", produced: " + productionDate + ", rote: " + initialStop;
	}
	
}
