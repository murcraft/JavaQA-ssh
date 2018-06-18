package by.htp.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) {
		
		StringBuilder text = new StringBuilder("Every hunter wants to know, where seats writer, not fasan ");
		String regex = "(ter)([ ,.!?-])";
		String insertString = "FIRE";
		
		System.out.println(text);
		System.out.println(changeText(text, regex, insertString));
	}
	
	public static StringBuilder changeText(StringBuilder text, String regex, String insertString) {
		Pattern pat1 = Pattern.compile(regex);
		Matcher match1 = pat1.matcher(text);
		
		while(match1.find()) {
			text.insert(match1.end(1), insertString);	
		}
		
		return text;		
	}	
}
