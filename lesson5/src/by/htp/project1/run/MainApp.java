package by.htp.project1.run;

import java.util.Scanner;

import by.htp.project1.entity.Accessories;
import by.htp.project1.entity.BouquetPart;
import by.htp.project1.entity.Flower;
import by.htp.project1.entity.Flowerbed;
import by.htp.project1.entity.Natural;
import by.htp.project1.entity.Rooms;

public class MainApp {

	public static void main(String[] args) {
		String inputMin;
		String inputMax;
		Scanner scanner = new Scanner(System.in);
				
		BouquetPart [] flowers =  new BouquetPart[] {
				new Natural("Chamomile", 2, "03.06.2018", 3.4, "white",  "spring", true),
				new Flowerbed("Pion", 4, "02.06.2018", 3.8, "pink", true),
				new Rooms("Orchidea", 25, "05.06.2018", 4.1, "yellow", true, false),
				new Rooms("Orchidea", 30, "05.06.2018", 4.5, "yellow", true, false),
				new Flowerbed("Pion", 4, "01.06.2018", 3.6, "pink", true),
				new Flowerbed("Gladiolus", 3, "04.06.2018", 3.8, "purple", true),
				new Accessories("greenery", 10, "green", 5.2, false),
				new Natural("Chamomile", 2, "03.06.2018", 3.7, "white", "spring", true),
				new Accessories("tape", 5, "gold", 5.2, true),
				new Accessories("tape", 3, "red", 5.2, false)
		};
		System.out.println("Bouquet composition:");
		printBouquetParts(flowers);
		System.out.println("Full price of  bouquet: " + getPriceBouquet(flowers) + "$");
		int counter = initNewFlowers(flowers); 
		Flower[] flow = insertNewFlowers(flowers, counter);
		fillSortFlowers(flowers, flow);	
		//printFlowParts(flow);
		System.out.println("Sort in fresh:");
		sortFlowers(flow);
		printFlowParts(flow);
		System.out.println("Enter min length: ");
		inputMin = scanner.nextLine();
		System.out.println("Enter max length:");
		inputMax = scanner.next();
		double min = Double.parseDouble(inputMin);
		double max = Double.parseDouble(inputMax);
		sortLengthArray(flow, min, max);
		
	}
	
	public static void printBouquetParts(BouquetPart[] flowers) {
		for (int i = 0; i < flowers.length; i++) {
			System.out.println((i + 1) + ") " + flowers[i].toString());
		}
	}
	
	public static int getPriceBouquet(BouquetPart[] flowers) {
		int bouquetPrice = 0;
		for (int i = 0; i < flowers.length; i++) {
			bouquetPrice += flowers[i].getCost();
		}
		return bouquetPrice;
	}
	
	public static int initNewFlowers(BouquetPart[] flowers) {
		int counter = 0;
		for (int i = 0; i < flowers.length; i++) {
			if(flowers[i] instanceof Flower)
				counter++;
		}		
		return counter;
	}
	
	public static Flower[] insertNewFlowers(BouquetPart[] flowers, int counter) {
		Flower [] sortFlowers =  new Flower[counter];
		for(int i = 0; i < sortFlowers.length; i++) {
			sortFlowers[i] = new Flower();
		}
		return sortFlowers;	
	}
	
	public static void /*Flower[]*/ fillSortFlowers(BouquetPart[] flowers, Flower[] sortFlowers) {
		int k = 0;
		for(int i = 0; i < flowers.length; i++) {
			if (flowers[i] instanceof Flower) {
				sortFlowers[k] = (Flower)flowers[i];
				//System.out.println((k + 1) + ") " + sortFlowers[k].toString());
				k++;	
			} 
		
		}
	}
	
	public static void printFlowParts(Flower[] flow) {
		for (int i = 0; i < flow.length; i++) {
			System.out.println(flow[i].toString());
		}
	}
	
	public static void sortFlowers(Flower [] flowers) {

		for(int i = flowers.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(flowers[j].markFresh() == null) {
					break;
				} else	{ 
					if(flowers[j].markFresh().compareTo(flowers[j + 1].markFresh()) > 0) {
					Flower tmp = flowers[j];
					flowers[j] = flowers[j + 1];
					flowers[j + 1] = tmp;
					}
				}
			}
		}
	}
	
	public static void sortLengthArray(Flower[] flow, double min, double max) {
		for(int i = 0; i< flow.length; i++) {
			if(flow[i].getLengthStem() >= min && flow[i].getLengthStem() < max) {
				System.out.println(flow[i].toString());
			
			}
		}
	}
	
}
	


