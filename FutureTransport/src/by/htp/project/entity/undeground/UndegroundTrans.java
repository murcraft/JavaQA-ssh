package by.htp.project.entity.undeground;

import by.htp.project.entity.PassengerTrans;

public class UndegroundTrans extends PassengerTrans {
	
	protected double widthOfRail;
	

	public UndegroundTrans() {
		super();
	}

	public UndegroundTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, String initialStop, String endingStop, double widthOfRail) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop);
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

}
