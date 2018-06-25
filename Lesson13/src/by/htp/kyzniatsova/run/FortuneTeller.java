package by.htp.kyzniatsova.run;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.PriorityQueue;
import by.htp.kyzniatsova.entity.Answer;
import by.htp.kyzniatsova.entity.Client;
import by.htp.kyzniatsova.entity.Prediction;
import by.htp.kyzniatsova.entity.Target;
import by.htp.kyzniatsova.logic.Methods;

public class FortuneTeller {

	public static void main(String[] args) {
		
		
		Methods.showMenu();
		Methods.calculatePredictionList();

		String value = Methods.chooseUserPrediction();;
		System.out.println(value);

		Answer answersLove = new Answer(Target.LOVE);
		Answer answersDie = new Answer(Target.DIE);
		Answer answersFamily = new Answer(Target.FAMILY);
		Answer answersCareer = new Answer(Target.CAREER);
		Answer answersFuture = new Answer(Target.FUTURE);
		Answer answersPets = new Answer(Target.PETS);	
		
//		System.out.println(answersLove.showLoveAnswer(Target.LOVE.ordinal()).peek());
		

		Map<Prediction, Answer> predict = new LinkedHashMap<>();
		
		predict.put(new Prediction(Target.LOVE), answersLove);
		predict.put(new Prediction(Target.DIE),   answersDie);
		predict.put(new Prediction(Target.FAMILY),  answersFamily);
		predict.put(new Prediction(Target.CAREER),  answersCareer);
		predict.put(new Prediction(Target.FUTURE),  answersFuture);
		predict.put(new Prediction(Target.PETS),  answersPets);

		Set <Entry<Prediction, Answer>> entry = predict.entrySet(); // множество пар ключ-значение
		Set <Prediction> keys = predict.keySet();// получили набор ключей 
//		
		if(value.equalsIgnoreCase("LOVE")) {
			System.out.println(answersLove.showLoveAnswer(Target.LOVE.ordinal()).remove());
			System.out.println(answersLove);
		}
		
		System.out.println("--------------");
	
		
		
		System.out.println(predict.remove(Target.LOVE, answersLove.showLoveAnswer(Target.LOVE.ordinal()).poll()));
		System.out.println(predict.remove(Target.LOVE, answersLove.showLoveAnswer(Target.LOVE.ordinal()).poll()));
		System.out.println(predict.remove(Target.LOVE, answersLove.showLoveAnswer(Target.LOVE.ordinal()).poll()));
			
		for (Map.Entry entry1 : predict.entrySet()) {
		
		    System.out.println(entry1.getKey() + ", " + entry1.getValue());
		}
		
	

		Queue<Client> clientsQueue = new PriorityQueue<Client>(10);
		clientsQueue.add(new Client(1, "Sergey"));
		clientsQueue.add(new Client(2, "Maria"));
		clientsQueue.add(new Client(3, "Pavel"));
		clientsQueue.add(new Client(4, "Kate"));
		clientsQueue.add(new Client(5, "Olga"));
		clientsQueue.add(new Client(6, "Petr"));
		clientsQueue.add(new Client(7, "Stanislava"));
		clientsQueue.add(new Client(8, "Nikolay"));
		clientsQueue.add(new Client(9, "Alisa"));
		clientsQueue.add(new Client(10, "Victoria"));
		
		
		for(Client cl : clientsQueue) {
			System.out.println(cl);
		}
		
		
		
		

		
		

	}

}
