package by.htp.task;

import java.util.Arrays;

public class Replace {
	public static void main(String[] args) {
		String pattern = "[,.!?]*? ";	
		String text = " Every hunter wants to know, where seats fasan";
		text = text.trim();

		String[] splitText = text.split(pattern);

		System.out.println(Arrays.toString(splitText));
		String sp = "";
		String spm = "";
		int k = 5;
		for(int i = 0; i < splitText.length; i++) {
			sp = splitText[i] + "";
			char [] letters = sp.toCharArray();
			
			for(int j = 0; j < letters.length; j++){
				if(j == (k - 1)) {
					letters[j] = 'O';
				}
			}
			spm += new String(letters) + " ";
		}
		
		System.out.println(spm);
		
		String line = "1 k";
		
		System.out.println(getNumber(line));

	}
	
	public static char getNumber(String line) {
		String regex = "[,.!?]*? ";	
		String[] str = line.split(regex);
		char number = str[0].charAt(0);
		return number;
	}
	
	public static char getLetter(String line) {
		String regex = "[,.!?]*? ";	
		String[] str = line.split(regex);
		char number = str[1].charAt(1);
		return number;
	}
}
//10 about string p195
