package by.htp.kyzniatsova.run;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.PriorityQueue;
import by.htp.kyzniatsova.entity.Answer;
import by.htp.kyzniatsova.entity.Client;
import by.htp.kyzniatsova.entity.ClientDate;
import by.htp.kyzniatsova.entity.Prediction;
import by.htp.kyzniatsova.entity.PredictionResult;
import by.htp.kyzniatsova.entity.Target;
import by.htp.kyzniatsova.logic.Methods;

public class FortuneTeller {
	public static final String targetLove = "Love";
	public static final String targetFamily = "Family";
	public static final String targetFuture = "Future";
	public static final String targetCareer = "Career";

	public static void main(String[] args) {

		String name = Methods.chooseUserUser();
		System.out.println("Hello, " + name);
		Methods.printMenu();
		Methods.calculatePredictionList();

		int value = Methods.chooseUserPrediction();;
		System.out.println(value);
		
		//------------------------------------------------------------------

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
		
		Queue<Answer> answersCareer = new LinkedList<Answer>();
		answersCareer.add(new Answer("You will be a famous programmer "));
		answersCareer.add(new Answer("You will work for Google "));
		answersCareer.add(new Answer("You will deserve a promotion "));


	
		
//-----------------------------------------------------------------------------------
		HashMap<Prediction, Queue<Answer>> predict = new LinkedHashMap<Prediction, Queue<Answer>>();
		
		predict.put(new Prediction(targetLove), answersLove);
		predict.put(new Prediction(targetFamily),  answersFuture);
		predict.put(new Prediction(targetFuture),  answersFamily);
		predict.put(new Prediction(targetCareer),  answersCareer);

//---------------------------------------------------------------------		
		
		String valueUserChoise = Methods.getTargetValue(value);
		
//		System.out.println(valueUserChoise);
//		
		if(valueUserChoise.equals("-1")) {
			System.out.println("Error value, try again");
		}
		
//		String valueUserChoise = "Love";
		Prediction pr = new Prediction(valueUserChoise);
		
		
	//-----------------------------------------------------------------
		
		Set <Entry<Prediction, Queue<Answer>>> entry = predict.entrySet(); // множество пар ключ-значение
		Set <Prediction> keys = predict.keySet();// получили набор ключей 
	
		Prediction keyOb = getKeyForUser(pr, keys);
		
		Answer answerForUser = predict.get(keyOb).poll();
		System.out.println(answerForUser);
		predict.get(keyOb).add(answerForUser);
		
		
//-------------------------------------------------------------------------------
		Map <ClientDate, PredictionResult> resultHistory = new HashMap <ClientDate, PredictionResult>();
		resultHistory.put(new ClientDate(), new PredictionResult(keyOb, answerForUser));
		
		for (Map.Entry entry1 : resultHistory.entrySet()) {
		    System.out.println(entry1.getKey() + ", " + entry1.getValue());
		}
		

//-------------------------------------------------------------------------------		
		System.out.println("--------------");
		
		for (Map.Entry entry2 : predict.entrySet()) {
		
		    System.out.println(entry2.getKey() + ", " + entry2.getValue());
		}
		
		//----------------------------------------------

		
		
		
		System.out.println("--------------");
		

		
//		Prediction keyOb = getKeyForUser(pr, keys);
		
		
		System.out.println("--------------");
		
//		for (Map.Entry entry2 : predict.entrySet()) {
//		    System.out.println(entry2.getKey() + ", " + entry2.getValue());
//		}
////		
//		for(Prediction i : keys) {
//			if(i.equals(pr)) {
//			
//			}
//		}
//	
		
		//------------------------------------------
	

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
	
	public static Queue<Answer> initAnswLove(){
		Queue<Answer> answersLove = new LinkedList<Answer>();
		answersLove.add(new Answer("Happy love all life "));
		answersLove.add(new Answer("Love to 3 persons "));
		answersLove.add(new Answer("One love for all life "));
		
		return answersLove;
	}
	
	public static Answer initAnswersLove() {
		Answer answers = new Answer(targetLove);
		return answers;
	}
	
	public static Answer initAnswersFamily() {
		Answer answers = new Answer(targetFamily);
		return answers;
	}
	
	public static Answer initAnswersFuture() {
		Answer answers = new Answer(targetFuture);
		return answers;
	}
	
	public static Answer initAnswersCareer() {
		Answer answers = new Answer(targetCareer);
		return answers;
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
