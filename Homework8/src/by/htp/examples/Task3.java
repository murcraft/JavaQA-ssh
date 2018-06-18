package by.htp.examples;

public class Task3 {
	
	public static void main(String[] args) {
		String initialText = "Кара у Раала украла корралы";

		System.out.println("Initial text: " + initialText);
		System.out.println("Changed text: " + correctError(initialText));
	}
	
	public static String correctError(String initialText) {
		String patternLow = "ра";
		String patternCap = "Ра";
		
		String rightLowLetters = "ро";
		String rightCapLetters = "Ро";
		String changedText = "";
		if(initialText.contains(patternLow)) {
			changedText = initialText.replaceAll(patternLow, rightLowLetters);
		} 
		else if(initialText.contains(patternCap)) {
			changedText = initialText.replaceAll(patternCap, rightCapLetters);
		} else {
			return "No matched";
		}
		return changedText;
	}
	

}
