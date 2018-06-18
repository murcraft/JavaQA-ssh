package by.htp.examples;

/*Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
 *последовательностями подряд идущих букв оставить хотя бы один пробел
 */

public class Task7 {

	public static void main(String[] args) {
		String text = "Every hunter wants to know, where seats writer, not fasan\n" + 
					"Every hunter wants to know, where seats writer, not fasan\n" + 
					"Every hunter wants to know, where seats writer, not fasan";
	
		String regex = "[ \t\n\r]+";
		String regex1 = "[^A-Za-zА-Яа-я ]";
	
		System.out.println(text);
	
		text = text.replaceAll(regex, " ");
		text = text.replaceAll(regex1, "");
		
		System.out.println(text);

	}

}
