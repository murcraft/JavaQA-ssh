package by.htp.examples;

public class Task8 {

/*
 * Удалить из текста его часть, заключенную между двумя символами, которые вводятся
 *(например, между скобками «(» и «)» или между звездочками «*» и т. п.).
 */
	
	
	public static void main(String[] args) {
		
		String text = "Every *hunter* wants to know, where seats writer, not fasan\n" + 
				"Every hunter wants to know, where seats writer, not fasan\n" + 
				"Every (hunter) wants to *know*, where seats writer, not fasan";
		System.out.println(text);
		
		String regex = "[\\*\\(][A-Za-zА-Яа-я]*[\\*\\)]";
		text = text.replaceAll(regex, "");
		System.out.println(text);

	}

}
