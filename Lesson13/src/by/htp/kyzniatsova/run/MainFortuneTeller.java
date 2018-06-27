package by.htp.kyzniatsova.run;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
import by.htp.kyzniatsova.logic.Methods;

public class MainFortuneTeller {
/**
 * initialize constants
 */
	public static final String targetLove = "Love";
	public static final String targetFamily = "Family";
	public static final String targetFuture = "Future";
	public static final String targetCareer = "Career";
	public static final int clientsNumber = 10;
	
	public static void main(String[] args) {
		int idClient = 0;
		
		Queue<Client> clientsQueue = new PriorityQueue<Client>();
		
		HashMap<Prediction, Queue<Answer>> predict = new LinkedHashMap<Prediction, Queue<Answer>>();
		
		predict.put(new Prediction(targetLove), Answer.initAnswersLove());
		predict.put(new Prediction(targetFamily),  Answer.initAnswersFamily());
		predict.put(new Prediction(targetFuture),  Answer.initAnswersFuture());
		predict.put(new Prediction(targetCareer),  Answer.initAnswersCareer());
		
		
		Set <Entry<Prediction, Queue<Answer>>> entry = predict.entrySet();
		Set <Prediction> keys = predict.keySet();
		
		Map <ClientDate, PredictionResult> resultHistory = new HashMap <ClientDate, PredictionResult>();
//		Map<ClientDate, Client> clientHistory = new HashMap<ClientDate, Client>();    доделать историю клиентов
		
	do {
		String name = Methods.getUserName();
		System.out.println("Hello, " + name);
		
		Methods.printMenu();
		Methods.calculateUserChoise();

		int value = Methods.getUserPrediction();
//		Methods.checkValuePredictionUSer(value);
//-------------------------------------------------------------------------------
		Prediction pr = new Prediction(Methods.getPredictionValue(value));
		idClient++;
//-------------------------------------------------------------------------------
	
		Prediction keyOb = getKeyForUser(pr, keys);
		Answer answerForUser = predict.get(keyOb).poll();
		System.out.println("My answer for you: " + answerForUser);
		predict.get(keyOb).add(answerForUser);
	
		resultHistory.put(new ClientDate(), new PredictionResult(keyOb, answerForUser));
	
		System.out.println("--------------------------------------------------------");
		
/*
 * possibility to print list of predictions and answers	
 * 		printPredictionList(predict);	
 */
		System.out.println("History of predictions:");
		printResultHistory(resultHistory);
		System.out.println();
		
		clientsQueue.add(new Client(idClient, name));
		System.out.println("Queue of clients:");
		printClientQueue(clientsQueue);
		
		if(clientsQueue.size() == clientsNumber) {
			Methods.printEndText();
			break;
		} 
		

		} while(true);
	
	}

	
	public static void printClientQueue(Queue<Client> clientsQueue) {
		for(Client cl : clientsQueue) {
			System.out.println(cl);
		}
		System.out.println("--------------------------------------------------------");
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
	
//	public static boolean checkValueUser(int value) {
//		if(value < 0 || value > 2) {
//			System.out.println("Error value, try again");
//			return true;
//		}
//		return false;
//	}

	
	public static Prediction getKeyForUser(Prediction pr, Set <Prediction> keys) {
		for(Prediction i : keys) {
			if(i.equals(pr)) {
				return i;
			}
		}
		return null;
	}
	

}
