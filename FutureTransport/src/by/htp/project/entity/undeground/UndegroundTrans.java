package by.htp.project.entity.undeground;

import by.htp.project.entity.PassengerTrans;
import by.htp.project.entity.addtables.StopPoint;

public class UndegroundTrans extends PassengerTrans {
	
	protected double widthOfRail;
	

	public UndegroundTrans() {
		super();
	}

	public UndegroundTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, StopPoint endingStop, double widthOfRail) {
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
