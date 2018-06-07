package by.htp.project.logic;

import by.htp.project.entity.PassengerTrans;

public class ArrayMethod {
	
	public static void printListTransport(PassengerTrans[] transport) {
		System.out.println("Passenger transport of Minsk in the future:");
		for (int i = 0; i < transport.length; i++) {
			System.out.println(transport[i]);
		}
	}
	
	public static void sortFare(PassengerTrans[] transport) {

		for (int i = transport.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
					if (transport[j].getFare() > transport[j + 1].getFare()) {
						PassengerTrans tmp = transport[j];
						transport[j] = transport[j + 1];
						transport[j + 1] = tmp;
					}
				}
			}
		}
	
	public static void sortSpeed(PassengerTrans[] transport) {

		for (int i = transport.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
					if (transport[j].getCost() > transport[j + 1].getCost()) {
						PassengerTrans tmp = transport[j];
						transport[j] = transport[j + 1];
						transport[j + 1] = tmp;
					}
				}
			}
		}

//	public void printDepart(PassengerTrans[] transport, String string) {
//		boolean flag = false;
//		System.out.println("Depart to " + string);
//		for (int i = 0; i < transport.length; i++) {
//			if(transport[i].getDestination().compareToIgnoreCase(string) == 0) {
//				transport.showClient(transport[i]);
//				flag = true;
//			}
//		}
//		if(!flag) {
//			System.out.println("Not found");
//		}
//	}
}
	
//	public static void printBouquetParts(BouquetPart[] flowers) {
//		for (int i = 0; i < flowers.length; i++) {
//			System.out.println((i + 1) + ") " + flowers[i].toString());
//		}
//	}
//
//	public static int getPriceBouquet(BouquetPart[] flowers) {
//		int bouquetPrice = 0;
//		for (int i = 0; i < flowers.length; i++) {
//			bouquetPrice += flowers[i].getCost();
//		}
//		return bouquetPrice;
//	}
//
//	public static int initNewFlowers(BouquetPart[] flowers) {
//		int counter = 0;
//		for (int i = 0; i < flowers.length; i++) {
//			if (flowers[i] instanceof Flower)
//				counter++;
//		}
//		return counter;
//	}
//
//	public static Flower[] insertNewFlowers(BouquetPart[] flowers, int counter) {
//		Flower[] sortFlowers = new Flower[counter];
//		for (int i = 0; i < sortFlowers.length; i++) {
//			sortFlowers[i] = new Flower();
//		}
//		return sortFlowers;
//	}
//
//	public static void fillSortFlowers(BouquetPart[] flowers, Flower[] sortFlowers) {
//		int k = 0;
//		for (int i = 0; i < flowers.length; i++) {
//			if (flowers[i] instanceof Flower) {
//				sortFlowers[k] = (Flower) flowers[i];
//				// System.out.println((k + 1) + ") " + sortFlowers[k].toString());
//				k++;
//			}
//		}
//	}
	
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
