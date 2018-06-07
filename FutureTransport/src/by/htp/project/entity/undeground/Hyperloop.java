package by.htp.project.entity.undeground;

public class Hyperloop extends UndegroundTrans {
	private boolean isMagnetic;

	public Hyperloop() {
		super();
	}

	public Hyperloop(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, String initialStop, String endingStop, double widthOfRail, boolean isMagnetic) {
		super(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, endingStop, widthOfRail);
		this.setMagnetic(isMagnetic);
	}

	public boolean isMagnetic() {
		return isMagnetic;
	}

	public void setMagnetic(boolean isMagnetic) {
		this.isMagnetic = isMagnetic;
	}
}
