package by.htp.project.entity.land;

import by.htp.project.entity.addtables.StopPoint;

public class Bike extends LandTrans{
	
	private boolean isFuel;

	public Bike() {
		super();
	}

	public Bike(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, StopPoint itialStop, StopPoint endingStop, boolean isWheeled, boolean isFuel) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop, endingStop, isWheeled);
		this.setFuel(isFuel);
		
	}

	public boolean isFuel() {
		return isFuel;
	}

	public void setFuel(boolean isFuel) {
		this.isFuel = isFuel;
	}


	
	

}
