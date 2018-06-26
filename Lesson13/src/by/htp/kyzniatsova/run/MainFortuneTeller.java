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

import by.htp.kyzniatsova.entity.answer.Answer;
import by.htp.kyzniatsova.entity.clients.Client;
import by.htp.kyzniatsova.entity.clients.ClientDate;
import by.htp.kyzniatsova.entity.prediction.Prediction;
import by.htp.kyzniatsova.entity.prediction.PredictionResult;
import by.htp.kyzniatsova.entity.prediction.Target;
import by.htp.kyzniatsova.logic.Methods;

public class MainFortuneTeller {
	
	public static final String targetLove = "Love";
	public static final String targetFamily = "Family";
	public static final String targetFuture = "Future";
	public static final String targetCareer = "Career";

	public static void main(String[] args) {
		int idClient = 0;
		
		Queue<Client> clientsQueue = new PriorityQueue<Client>();
		
		HashMap<Prediction, Queue<Answer>> predict = new LinkedHashMap<Prediction, Queue<Answer>>();
		
		predict.put(new Prediction(targetLove), Answer.initAnswersLove());
		predict.put(new Prediction(targetFamily),  Answer.initAnswersFamily());
		predict.put(new Prediction(targetFuture),  Answer.initAnswersFuture());
		predict.put(new Prediction(targetCareer),  Answer.initAnswersCareer());
		
		
		Set <Entry<Prediction, Queue<Answer>>> entry = predict.entrySet(); // множество пар ключ-значение
		Set <Prediction> keys = predict.keySet();// получили набор ключей 
		
		Map <ClientDate, PredictionResult> resultHistory = new HashMap <ClientDate, PredictionResult>();
//		Map<ClientDate, Client> clientHistory = new HashMap<ClientDate, Client>();    доделать историю клиентов
		
	do {
		String name = Methods.getUserName();
		System.out.println("Hello, " + name);
		
		Methods.printMenu();
		Methods.calculatePredictionList();

		int value = Methods.chooseUserPrediction();
		
		if(checkValuePredictionUSer(value) == true) {
			continue;
		} else {
			System.out.println(value);
		}

//-------------------------------------------------------------------------------
		Prediction pr = new Prediction(Methods.getTargetValue(value));
		idClient++;
//-------------------------------------------------------------------------------
	
		Prediction keyOb = getKeyForUser(pr, keys);
		Answer answerForUser = predict.get(keyOb).poll();
		System.out.println("My answer for you: " + answerForUser);
		
		predict.get(keyOb).add(answerForUser);
//-------------------------------------------------------------------------------
	
		resultHistory.put(new ClientDate(), new PredictionResult(keyOb, answerForUser));
		
//-------------------------------------------------------------------------------		
		System.out.println("--------------------------------------------------------");
//		printPredictionList(predict);
		printResultHistory(resultHistory);
	
//-------------------------------------------------------------------------------
		
		clientsQueue.add(new Client(idClient, name));
		printClientQueue(clientsQueue);
		
		if(clientsQueue.size() == 2) {
			printEndText();
			break;
		} 
		System.out.println("--------------------------------------------------------");

		} while(true);
	
	}
	
	public static void printEndText() {
		System.out.println("--------------------------------------------------------");
		System.out.println("The queue is full");
		System.out.println("Thanks, bye!!");
	}
	
	public static void printClientQueue(Queue<Client> clientsQueue) {
		for(Client cl : clientsQueue) {
			System.out.println(cl);
		}
	}
	
	
	public static void printPredictionList(HashMap<Prediction, Queue<Answer>> predict) {
		for (Map.Entry entry : predict.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
	
	public static void printResultHistory(Map <ClientDate, PredictionResult> resultHistory) {
		for (Map.Entry entry : resultHistory.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
	
	public static boolean checkValuePredictionUSer(int value) {
		if(value < 0 || value > 4) {
			System.out.println("Error value, try again");
			return true;
		}
		return false;
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
