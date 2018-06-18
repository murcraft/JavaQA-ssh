package by.htp.examples;

public class Task2 {
	public static void main(String[] args) {
		String testString = "В тексте каждую букву заменить порядковым номером в алфавите";
        String lowerString = testString.toLowerCase();
        String numbersString = "";
        String formattedString = "";

        System.out.println(getLettersNumbers(lowerString, numbersString));
        System.out.println(setLettersSroke(testString, formattedString));
    }

    public static String getLettersNumbers(String testString, String codeString){
        for(char ch : testString.toCharArray()) {
            codeString += Character.isAlphabetic(ch) ? String.format("%-4s",ch - 'a' - 974) : ch;
        }
        return codeString;
    }

    public static String setLettersSroke(String testString1, String formattedString){
        for(char ch : testString1.toCharArray()) {
            formattedString += Character.isAlphabetic(ch) ? String.format("%-4s",ch) : ch;
        }
        return formattedString;
    }
	
}
