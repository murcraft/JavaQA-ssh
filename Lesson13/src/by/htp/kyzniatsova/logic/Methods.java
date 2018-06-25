package by.htp.kyzniatsova.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import by.htp.kyzniatsova.entity.Target;

public class Methods {
	
	public static void showMenu() {
		System.out.println("Hello,are you ready to look into the future?");
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

	public static void showPredictions() {
		System.out.printf("%s  %s  %s  %s  %s  %s", Target.LOVE, Target.DIE, Target.FAMILY, Target.CAREER, Target.FUTURE, Target.PETS);
		System.out.println();
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
	
	public static String chooseUserPrediction() {
//		InputStreamReader ir = new InputStreamReader(System.in);
		
//		try(BufferedReader br = new BufferedReader(ir)) {
//			String option = br.readLine();
//			return option;
//		} catch (IOException e) {
//			System.out.println("Error prediction, enter correct value");
//		}
//		return "-1";
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		scan.close();
		return option;
		
	}

}
