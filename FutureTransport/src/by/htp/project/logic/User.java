package by.htp.project.logic;

import java.util.Scanner;

import by.htp.project.entity.PassengerTrans;
import by.htp.project.entity.points.ListPoint;

public class User {
	private String startPoint;
	private String endPoint;
	private static int num;
	
	
	public static void showMenu() {
		System.out.println("Hello! Choose point, please:");
		System.out.println("1 - print transport;\n2 - sort transport in fair and print;\n3 - sort transport in average speed and print;"
				+ "\n4 - Show stop points with distanse.");
	}
	
	@SuppressWarnings("resource")
	public static int getUserNum() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}
	
	public static int getUserCommand() {
		switch (getUserNum()) {
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
		case 4:
			return 4;
		default:
			return 0;
		}
	}
	
	public static boolean isTrueUserCommand(int num) {
		if(num == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void showTranspToUser(int num, PassengerTrans[] transport, ListPoint stopPoints, double avrSpeed[]) {
		if(num == 1) {
			System.out.println("Print transport:");
			ArrayMethod.printListTransport(transport);
		} else if(num == 2) {				
			System.out.println("Sort in fare:");
			ArrayMethod.sortFare(transport);
			ArrayMethod.printListTransport(transport);
		} else if(num == 3) {
			System.out.println("Sort in average speed:");
			ArrayMethod.sortAvrSpeed(transport, avrSpeed);
			ArrayMethod.printListTransport(transport);
		} else if(num == 4) {
			System.out.println("Show stop points:");
			ListPoint.showStopPoints(stopPoints);
		}
		else {
			System.out.println("Error command");
			}
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public int getNum() {
		return num;
	}

}
