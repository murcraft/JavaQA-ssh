package by.htp.project.entity;

public class PassengerTrans extends Transport {
	
	protected int fare;
	protected int capacityOfPeople;

	public PassengerTrans() {

	}
	
	public PassengerTrans(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, String initialStop, String endingStop) {
		super(name, cost, speedUp, constructSpeed, productionDate, initialStop, endingStop);
		this.fare = fare;
		this.capacityOfPeople = capacityOfPeople;	
	}
	


	@Override
	public boolean isStartMovie() {
		return false;
	}

	@Override
	public boolean isEndMovie() {
		return false;
	}

	@Override
	public boolean isMovie() {
		return false;
	}	
	
//	private PassengerTrans[] transport;
//	private int nElems;
//	
//	public static void initPassengerTrans(PassengerTrans[] transport) {
//		for(int i = 0; i < transport.length; i++) {
//			transport[i] = new PassengerTrans();
//		}
//	}
//	
//	public PassengerTrans(int max) {
//		transport = new PassengerTrans[max];
//		nElems = 0;
//	}
//	
//	
//	public void addPassegerTrans(PassengerTrans transport1,  String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, String itialStop, String endingStop) {
//		if(nElems != transport.length && nElems >= 0) {
//			transport[nElems] = new PassengerTrans(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, itialStop, endingStop);
//			nElems++;
//		} else {
//			System.out.println("Error");
//		}
//	}
//	
//	public static void displayTransport(PassengerTrans[] transport) {
//		for(int i = 0; i < transport.length; i++) {
//			System.out.println(transport[i]);
//		}
//	}
//
//	public PassengerTrans[] getTransport() {
//		return transport;
//	}
//
//	public void setTransport(PassengerTrans[] transport) {
//		this.transport = transport;
//	}
//
//	public int getnElems() {
//		return nElems;
//	}
//
//	public void setnElems(int nElems) {
//		this.nElems = nElems;
//	}

	public String toString() {
		return "PassengerTrans [fare=" + fare + ", capacityOfPeople=" + capacityOfPeople + ", transport="
				+ ", " + ", name=" + name + ", cost=" + cost + ", speedUp="
				+ speedUp + ", constructSpeed=" + constructSpeed + ", productionDate=" + productionDate + ", itialStop="
				+ itialStop + ", endingStop=" + endingStop + "]";
	}
	
}
