package by.htp.project.entity.land;

public class Bike extends LandTrans{
	
	private boolean isFuel;

	public Bike() {
		super();
	}

	public Bike(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, String itialStop, String endingStop, boolean isWheeled, boolean isFuel) {
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
