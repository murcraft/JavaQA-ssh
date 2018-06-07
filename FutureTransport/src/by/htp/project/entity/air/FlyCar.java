package by.htp.project.entity.air;

public class FlyCar extends AirTrans{
	
	private boolean isMobile;

	public FlyCar() {
		super();
	}

	public FlyCar(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, String initialStop, String endingStop, double maxHgtAltitude, boolean isMobile) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop,
				maxHgtAltitude);
		this.setMobile(isMobile);
	}

	public boolean isMobile() {
		return isMobile;
	}

	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}

}
