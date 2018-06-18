package by.htp.examples;
/*
 * Определить, сколько раз повторяется в тексте каждое слово, которое встречается
в нем.
 */

import java.util.Arrays;
import java.util.HashMap;

public class Task9 {

	public static void main(String[] args) {
		String text = "Every hunter wants to know, where seats writer, not fasan hunter wants to know, where seats writer, not fasan"; 
				
		String regex = "[,.!?]*? ";
		String[] splitText = text.toLowerCase().split(regex);
		System.out.println(Arrays.toString(splitText));
		countOfWordDiff(splitText);

	}
	
	public static void countOfWord(String[] splitText) {
		HashMap<String, Integer> countWord = new HashMap<>();
		
		for(String word : splitText) {
			if(!countWord.containsKey(word)) {
				countWord.put(word,  0);
			}
			countWord.put(word, countWord.get(word) + 1);
		}
		
		for(String word : countWord.keySet()) {
			System.out.print(word + "(" + countWord.get(word)+ ") ");
		}
	}
	
	public static void countOfWordDiff(String[] splitText) {
		HashMap<String, Integer> countWord = new HashMap<>();
		
		for(String word : splitText) {
			if(!word.isEmpty()) {
				Integer count = countWord.get(word);
				if(count == null) {
					count = 0;
				}
				countWord.put(word,  ++count);
			}
		}
		
		for(String word : countWord.keySet()) {
			System.out.print(word + "(" + countWord.get(word) + ") ");
		}
	}

}
