package by.htp.project.entity;

import by.htp.project.entity.points.StopPoint;

public class ListTransport {
	
	private PassengerTrans[] transport;
	private final static int amtTransp = 10;
	private int nElems;
	private Object UndegroundTrans;
	private Object LandTrans;
	
	public ListTransport(int amtTransp) {
		if(transport.getClass().equals(UndegroundTrans)) {
			transport =  new UndegroundTrans[amtTransp];
		} else if(transport.getClass().equals(LandTrans)) {
			transport =  new LandTrans[amtTransp];
		} else if(transport.getClass().equals(LandTrans)) {
			transport =  new LandTrans[amtTransp];
		} else {
			transport =  new PassengerTrans[amtTransp];
		}
		nElems = 0;
	}
	
	public void add(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop) {
		transport[nElems] = new PassengerTrans(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop);
		nElems++;
	}
	
	public void addUnd(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, double widthOfRail) {
		transport[nElems] = new UndegroundTrans(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, widthOfRail);
		nElems++;
	}
	
	public void addLand(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, boolean isWheeled) {
		transport[nElems] = new LandTrans(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, isWheeled);
		nElems++;
	}
	
	public void addAir(String name, int cost, int fare, double speedUp, double constructSpeed, String productionDate, int capacityOfPeople, StopPoint initialStop, double maxHgtAltitude) {
		transport[nElems] = new AirTrans(name, cost, fare, speedUp, constructSpeed, productionDate, capacityOfPeople, initialStop, maxHgtAltitude);
		nElems++;
	}
	
	public PassengerTrans getTranspItem(int nElems) {
		if(nElems >= 0 && nElems < amtTransp) {
			return transport[nElems];
		}
			return null;
	}
	
	public void getTransport(PassengerTrans[] transport) {
		this.transport = transport;
	}
	
	public PassengerTrans[] getTransport() {
		return transport;
	}
	
	public static void displayPassengerTrans(ListTransport transport) {
		for (int i = 0; i < transport.getTransport().length; i++) {
			System.out.println(transport.getTranspItem(i));
		}
	}

}
