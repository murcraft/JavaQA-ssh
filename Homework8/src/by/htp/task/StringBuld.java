package by.htp.task;

import java.util.Scanner;

public class StringBuld {

	public static void main(String[] args) {
		String text = "Every hunter wants to know, where seats fasan ";
       		
        System.out.println("Initial text: " + text);
        System.out.println("Changed text: " + changeText(text));

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
	
	public static StringBuilder changeText(String text) {
		StringBuilder sb = new StringBuilder(text);
	    int k = getNumber();
        int j = 0;
    
        for(int i = 0; i < sb.length(); i++) {
    	   char ch = sb.charAt(i);
           if(ch == ',' || ch == ' ') {
               j = -1;
           }

           if(j == (k - 1)) {
               sb.setCharAt((i), 'O');
             
           }
           j++;
        }
        return sb;
	}

}
