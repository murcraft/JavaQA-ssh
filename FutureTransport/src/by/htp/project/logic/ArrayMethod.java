package by.htp.project.logic;

import by.htp.project.entity.PassengerTrans;

public class ArrayMethod {
	
	public static void printListTransport(PassengerTrans[] transport) {
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
				if (transport[j].getConstructSpeed() > transport[j + 1].getConstructSpeed()) {
					PassengerTrans tmp = transport[j];
					transport[j] = transport[j + 1];
					transport[j + 1] = tmp;
				}
			}
		}
	}

	public static void showDist(PassengerTrans[] transport) {
	
		for (int i = 0; i < transport.length; i++) {
			System.out.println(transport[i].getInitialStop().getDistance());
		}
	}
	
	public static void sortAvrSpeed(PassengerTrans[] transport, double avrSpeed[]) {

		for (int i = transport.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (initAvrSpeed(transport, avrSpeed)[j] > initAvrSpeed(transport, avrSpeed)[j + 1]) {
					double tmpSp = initAvrSpeed(transport, avrSpeed)[j];
					initAvrSpeed(transport, avrSpeed)[j] = initAvrSpeed(transport, avrSpeed)[j + 1];
					initAvrSpeed(transport, avrSpeed)[j + 1] = tmpSp;
					
					PassengerTrans tmp = transport[j];
					transport[j] = transport[j + 1];
					transport[j + 1] = tmp;
				}
			}
		}
	}
	
	public static void printAvrSpeed(double avrSpeed[]) {
		for (int i = 0; i < avrSpeed.length; i++) {
			System.out.println(avrSpeed[i]);
		}
	}
	
	public static double[] initAvrSpeed(PassengerTrans[] transport, double avrSpeed[]) {
		double time = 0;
		double dist = 0;
		for (int i = 0; i < transport.length; i++) {
			dist = Double.parseDouble(transport[i].getInitialStop().getDistance());
			time = Math.sqrt(dist / transport[i].getSpeedUp());
			avrSpeed[i] = Math.round(dist / time);
		}
		return avrSpeed;
	}
	
}


