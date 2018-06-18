package by.htp.examples;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		String text = "Every hunter wants to know, where seats fasan ";
		String insertString = "FIRE";
   		
        System.out.println("Initial text: " + text);
        System.out.println("Changed text: " + changeText(text, insertString));

	}
	
	public static int getNumber() {
		int k = 0;
		System.out.println("ENTER number of letter: ");
		Scanner scan = new Scanner(System.in);
		try {
			k = scan.nextInt();
		} catch(java.util.InputMismatchException e) {
			System.out.println("Error value");
			return -1;
		} finally {
			scan.close();
		}
		return k;
	}
	
	public static StringBuilder changeText(String text, String insertString) {
		StringBuilder sb = new StringBuilder(text);
	    int k = getNumber();
    
        for(int i = 0; i < sb.length(); i++) {
    	
           if(i == k) {
               sb.insert(k, insertString);
               break;
           }
        }
        return sb;
	}

}
