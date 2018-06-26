package by.htp.kyzniatsova.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import by.htp.kyzniatsova.entity.Target;

public class Methods {
	
	public static void printMenu() {
		System.out.println("Enter 1 to look at prediction list and consult a fortuneteller;");
		System.out.println("Enter 2 to exit.");
	}
	
	public static void calculatePredictionList(){
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
				break;
			}

	
	}
	
	public static String getTargetValue(int position) {
		if(position <= 0 || position >4) {
			return "-1";
		}
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
		
/*		Target[] targets = Target.values();
		if(position <= 0 || position > targets.length) {
			return "-1";
		}
		for(int i = 0; i < targets.length; i++) {
			if((position - 1) == i) {
				String value = targets[i] + "";
				System.out.println(value);
				return value;
			
			}
		}
		return "-1";
		*/
	}

	public static void showPredictions() {
		System.out.printf("%7d |%7d |%7d |%7d |", 1, 2, 3, 4);
		System.out.println();
		System.out.printf("%7s |%7s |%7s |%7s |", Target.LOVE, Target.FAMILY, Target.FUTURE, Target.CAREER);
		System.out.println();
		System.out.println();
		System.out.println("Enter according number of target");
		System.out.println("--->");
	}
	
	public static void choiseUser() {
		System.out.println("Choose one of the points to fortune-telling");
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
	
	public static int chooseUserPrediction() {
//		InputStreamReader ir = new InputStreamReader(System.in);
		
//		try(BufferedReader br = new BufferedReader(ir)) {
//			String option = br.readLine();
//			return option;
//		} catch (IOException e) {
//			System.out.println("Error prediction, enter correct value");
//		}
//		return "-1";
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		scan.close();
		return option;
		
	}
	
	public static String chooseUserUser() {
		System.out.println("Hello, are you ready to look into the future?");
		System.out.println("Enter your name");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		try {
			String name = br.readLine();
			return name;
		} catch (IOException e) {
			System.out.println("Error value, enter correct value");

		} 
		return "user";
		
	}

}
