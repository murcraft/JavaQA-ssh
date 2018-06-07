package by.htp.project.entity.land;

import by.htp.project.entity.PassengerTrans;

public abstract class LandTrans extends PassengerTrans {
	
	protected boolean isWheeled;
	
	public LandTrans() {
		super();
	}

	public LandTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, String itialStop, String endingStop, boolean isWheeled) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop, endingStop);
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

}
