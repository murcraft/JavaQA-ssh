package by.htp.examples;

import java.util.Arrays;
import java.util.HashMap;

/*
 * В тексте найти и напечатать n символов (и их количество), встречающихся
 *наиболее часто.
 */

public class Task10 {

	public static void main(String[] args) {
		String text = "Every  hunter wants to know, where seats writer, not fasan hunter wants to know, where seats writer, not fasan"; 

		char[] splitText = text.toLowerCase().replaceAll(" ", "").toCharArray();
		System.out.println(Arrays.toString(splitText));
		countOfSymbol(splitText);
	}
	
	public static void countOfSymbol(char[] splitText) {
		HashMap<Character, Integer> countChar = new HashMap<>();
		
		for(Character ch : splitText) {
			Integer count = countChar.get(ch);
				if(count == null) {
					count = 0;
				}
				countChar.put(ch,  ++count);
			
		}
		
//		for(char ch : countChar.keySet()) {
//			System.out.print(ch + ": " + countChar.get(ch) + "; ");
//		}
		
		for(Character ch : countChar.keySet()) {
			if(countChar.get(ch) >= countChar.getOrDefault(3, 5))
				System.out.print(ch + ": " + countChar.get(ch) + "; ");
			
		}
	}

}
