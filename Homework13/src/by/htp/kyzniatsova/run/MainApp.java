package by.htp.kyzniatsova.run;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;

import by.htp.kyzniatsova.entity.Answer;
import by.htp.kyzniatsova.entity.Prediction;
import by.htp.kyzniatsova.entity.Target;

public class MainApp {
	public static void main(String[] args) {
	
		Queue<Answer> answersLove = new LinkedList<Answer>();
		answersLove.add(new Answer("Happy love all life "));
		answersLove.add(new Answer("Love to 3 persons "));
		answersLove.add(new Answer("One love for all life "));
		
		Queue<Answer> answersFuture = new LinkedList<Answer>();
		answersFuture.add(new Answer("You will have been living 100 years "));
		answersFuture.add(new Answer("You will get rescue "));
		answersFuture.add(new Answer("You will transform your body "));
		
		Queue<Answer> answersFamily = new LinkedList<Answer>();
		answersFamily.add(new Answer("You will have been always get together "));
		answersFamily.add(new Answer("Happy family all life "));
		answersFamily.add(new Answer("You will have 5 children "));

	
		HashMap<Prediction, Queue<Answer>> fortuneTellers = new LinkedHashMap<Prediction, Queue<Answer>>();
		fortuneTellers.put(new Prediction("LOVE"), answersLove);
		fortuneTellers.put(new Prediction("FUTURE"), answersFuture);
		fortuneTellers.put(new Prediction("FAMILY"), answersFamily);
		
		
		String value = "LOVE";
		Prediction pr = new Prediction(value);
		
		Set <Entry<Prediction, Queue<Answer>>> entry = fortuneTellers.entrySet(); // множество пар ключ-значение
		Set <Prediction> keys = fortuneTellers.keySet();// получили набор ключей 
		

		Prediction keyOb = getKeyForUser(pr, keys);
		
		System.out.println(fortuneTellers.get(keyOb).poll());

		
		System.out.println("--------------");
		
		for (Map.Entry entry1 : fortuneTellers.entrySet()) {
		    System.out.println(entry1.getKey() + ", " + entry1.getValue());
		}
	
	
	}
	
	public static Prediction getKeyForUser(Prediction pr, Set <Prediction> keys) {
	for(Prediction i : keys) {
		if(i.equals(pr)) {
	
			return i;
		}
	}
	return null;
	}
}
