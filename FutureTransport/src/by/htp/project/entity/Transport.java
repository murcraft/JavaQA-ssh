package by.htp.project.entity;

public abstract class Transport {
	protected String name;
	protected int cost;
	protected double speedUp;
	protected double constructSpeed;
	protected String productionDate;
	protected String itialStop;
	protected String endingStop;
	
	public Transport() {
		
	}
	
	public Transport(String name, int cost, double speedUp, double constructSpeed, String productionDate,  String itialStop, String endingStop) {
		this.name = name;
		this.cost = cost;
		this.speedUp = speedUp;
		this.constructSpeed = constructSpeed;
		this.productionDate = productionDate;
		this.itialStop = itialStop;
		this.endingStop = endingStop;
	}
	
	public abstract boolean isStartMovie();
	
	public abstract boolean isEndMovie();
	
	public abstract boolean isMovie();

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
