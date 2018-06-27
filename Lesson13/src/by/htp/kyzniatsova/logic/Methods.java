package by.htp.kyzniatsova.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import by.htp.kyzniatsova.entity.prediction.Target;

public class Methods {
	
	
	public static String getUserName() {
		System.out.println("Hello, are you ready to look into the future?");
		System.out.println("Enter your name");
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		return option;
	}
	
	public static void printMenu() {
		System.out.println("Enter 1 to look at prediction list and consult a fortuneteller;");
		System.out.println("Enter 2 to exit.");
	}
	
	public static void calculateUserChoise(){
			int option = chooseUserOption();
			System.out.println(option);
			switch (option) {
			case 1:
				choiseUser();
				break;
			case 2:
				System.out.println("Thanks for the choise, bye!");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong value, try again");
				calculateUserChoise();
				break;
			}
	}
	
	public static void calculatePredictionList(){
		int option = getUserPrediction();
		System.out.println(option);
		switch (option) {
		case 1:
			getPredictionValue(1);
			break;
		case 2:
			getPredictionValue(2);
			break;
		case 3:
			getPredictionValue(3);
			break;
		case 4:
			getPredictionValue(4);
			break;
		default:
			System.out.println("Wrong value, try again");
			getUserPrediction();
			break;
		}
}

	
	public static String getPredictionValue(int position) {

		switch(position) {
		case 1:
			return "Love";
			
		case 2:
			return "Family";
		case 3:
			return "Future";
		
		case 4:
			return "Career";
		
		default:
			return "-1";
		}
	}
	
	
	public static void checkValuePredictionUSer(int value) {
		if(value < 0 || value > 4) {
			System.out.println("Error value, try again");
			 getUserPrediction();
		}
	}

	public static void showPredictions() {
		System.out.println("------------------------------------");
		System.out.printf("%7d |%7d |%7d |%7d ", 1, 2, 3, 4);
		System.out.println();
		System.out.println("------------------------------------");
		System.out.printf("%7s |%7s |%7s |%7s ", Target.LOVE, Target.FAMILY, Target.FUTURE, Target.CAREER);
		System.out.println();
		System.out.println("------------------------------------");
		
		System.out.println("Enter the appropriate numerical value:");

	}
	
	public static void choiseUser() {
		System.out.println("I propose you next predictions:");
		showPredictions();

	}
	
	public static int chooseUserOption() {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		try {
			String str = br.readLine();
			int option = Integer.parseInt(str);
			return option;
		} catch (IOException e) {
			System.out.println("Error value, enter correct value");

		} 
		return -1;
	}
	
	public static int getUserPrediction() {
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		if(option < 0 || option > 4) {
			System.out.println("Error value, try again");
			getUserPrediction();
			return 1;
		} else {
			return option;
		}
	}
		
	public static void printEndText() {
		System.out.println("--------------------------------------------------------");
		System.out.println("The queue is full");
		System.out.println("Thanks, bye!!");
		System.out.println("--------------------------------------------------------");
	}

}
