package by.htp.project.logic;

import by.htp.project.entity.PassengerTrans;

public class ArrayMethod {
	
	public static void printListTransport(PassengerTrans[] transport) {
		System.out.println("Passenger transport of Minsk in the future:");
		for (int i = 0; i < transport.length; i++) {
			System.out.println(transport[i]);
		}
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

}
