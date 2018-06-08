package by.htp.project.logic;

import by.htp.project.entity.PassengerTrans;
import by.htp.project.entity.addtables.StopPoint;

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
	
	public static int getStartPoint(StopPoint [] stopPoints, StopPoint a) {
		int position;
			for (int j = 0; j < stopPoints.length; j++) {
				if(stopPoints[j].getName().equals(a)) {
					position = j;
					return position;
				}		
			}
		return 0;
	}
	
	public static int getEndPoint(StopPoint [] stopPoints, StopPoint a) {
		int position;
			for (int j = 0; j < stopPoints.length; j++) {
				if(stopPoints[j].getName().equals(a)) {
					position = j;
					return position;
				}		
			}
		return 0;
	}
	
}