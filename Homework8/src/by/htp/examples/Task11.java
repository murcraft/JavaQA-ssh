package by.htp.examples;


 //однострочный комментарий
/*
 * Из кода Java удалить все комментарии (//, /*, /**).
 */

public class Task11 {

	public static void main(String[] args) {		
		String text = "//однострочный комментарий\n" + 
				"/*\n" + 
				" * Из кода Java удалить все комментарии (//, /*, /**).\n" + 
				" */\n" + 
				"/** \n" + 
				" * \n" + 
				" * @author helen\n" + 
				" *\n" + 
				" */";
		
		String regex = "[(//)?(/*)?(/**)?(*/)?]";
		
		text = text.replaceAll(regex, "");
		System.out.println(text);
	}

}
