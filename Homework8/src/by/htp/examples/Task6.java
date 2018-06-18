package by.htp.examples;

import java.util.Scanner;

/*
 * *В зависимости от признака (0 или 1) в каждой строке текста удалить указанный
символ везде, где он встречается, или вставить его после k-гo символа.
 */
public class Task6 {

	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("Every hunter wants to know, where seats writer, not fasan" + "\n" + 
				"Every hunter wants to know, where seats writer, not fasan" + "\n" +
				"Every hunter wants to know, where seats writer, not fasan");
		String deletedChar = "e";
		System.out.println(text);
		System.out.println();

		mainMenu(text, deletedChar) ;
		
	}
	
	public static void mainMenu(StringBuilder text, String deletedChar) {
		System.out.println("ENTER 1 - delete symbol, 0 - insert symbol");
		int choise = getNumber();
		if(choise == 1) {
			System.out.println(changeText(text, deletedChar));
		} else if(choise == 0) {
			System.out.println("ENTER number of letter: ");
			System.out.println(insertText(text, deletedChar) );
		} else {
			System.out.println("Wrong number");
		}
	}
	
	public static int getNumber() {
		int k = 0;
		
		Scanner scan = new Scanner(System.in);
		try {
			k = scan.nextInt();
			
		} catch(java.util.InputMismatchException e) {
			System.out.println("Error value");
			return -1;
		} 
		return k;
	}
	
	public static StringBuilder changeText(StringBuilder text, String deletedChar) {
		
		String deletedChar1 = deletedChar.toLowerCase() + deletedChar.toUpperCase();
		
			for(int j = 0; j < text.length(); j++) {
				if(text.charAt(j) == deletedChar1.charAt(0) || text.charAt(j) == deletedChar1.charAt(1)) {
					text.deleteCharAt(j);
				}
			}
		
		return text;	
	}
	
	public static StringBuilder insertText(StringBuilder text, String deletedChar) {
		char symbol = deletedChar.charAt(0);
	    int k = getNumber();
        int j = 0;
    
        for(int i = 0; i < text.length(); i++) {
    	   char ch = text.charAt(i);
           if(ch == ',' || ch == ' ' || ch == '\n') {
               j = -1;
           }

           if(j == (k - 1)) {
               text.setCharAt((i), symbol);
           }
           j++;
        }
        return text;
	}

}
