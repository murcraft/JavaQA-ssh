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


public class FortuneTeller {

	public static void main(String[] args) {
		
		Queue<Answer> answers = new LinkedList<Answer>();
		
		Map<Prediction, Answer> predict = new LinkedHashMap<>();
		
		predict.put(new Prediction(1), new Answer(1));
		predict.put(new Prediction(2), new Answer(2));
		predict.put(new Prediction(3), new Answer(3));
		
		Set <Entry<Prediction, Answer>> entry = predict.entrySet(); // множество пар ключ-значение
		Set <Prediction> keys = predict.keySet();// получили набор ключей 
		
		for(Prediction p : keys) {
			System.out.println(predict.get(p));
		}
		
		System.out.println("--------------");
		
//		for (int i = 1; i < map.size() + 1; i++) {
//			System.out.println(map.get(i));
//		}

		
	

	}

}
