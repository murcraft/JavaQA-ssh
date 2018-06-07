package by.htp.project.entity.air;

public class SkyTran extends AirTrans  {
	
	private boolean isSkyPod;
	private boolean isSelfDriven;
	
	public SkyTran() {
		super();
	}
	
	public SkyTran(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate,
			int capacityOfPeople, String initialStop, String endingStop, double maxHgtAltitude, boolean isSkyPod, boolean isSelfDriven) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop,
				maxHgtAltitude);
		this.setSelfDriven(isSelfDriven);
		this.setSkyPod(isSkyPod);
	}
	
	public boolean isSkyPod() {
		return isSkyPod;
	}
	public void setSkyPod(boolean isSkyPod) {
		this.isSkyPod = isSkyPod;
	}
	public boolean isSelfDriven() {
		return isSelfDriven;
	}
	public void setSelfDriven(boolean isSelfDriven) {
		this.isSelfDriven = isSelfDriven;
	}
	
}
