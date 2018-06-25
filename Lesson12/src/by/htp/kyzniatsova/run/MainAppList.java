package by.htp.kyzniatsova.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MainAppList {
	public static void main(String[] args) {
		Iterable iterable = null;
		
		//рабатают только со ссылочными типами данных
		Collection collection = null;
		List list = null;
		Set set = null;
		Queue queue = null;
		
		Map map = null; // не наследует collection
		
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list1.add("Five");
		
		for (String object : list1) {
			System.out.println(object);
		}
		
		
		ArrayList<String> list2 = new ArrayList<>();
		
		
		List<String> list3 = new LinkedList<>();
		list3.add("One");  // завернуты в node(ссылка на след элемент)
		list3.add("Two");
		list3.add("Three");
		list3.add("Four");
		list3.add("Five");
		
		
		for (String object : list3) {
			System.out.println(object);
		}
		
		Deque <String> list4 = new LinkedList<>();
		list4.add("One");  // завернуты в node(ссылка на след элемент)
		list4.add("Two");
		list4.add("Three");
		list4.add("Four");
		list4.add("Five");
	
		
		System.out.println(list4.pop());
		System.out.println(list4.peek());
		System.out.println(list4.poll());
		System.out.println(list4.offer("five"));
		
		LinkedList <String> list5 = new LinkedList<>();
		list5.add("One");  // завернуты в node(ссылка на след элемент)
		list5.add("Two");
		list5.add("Three");
		list5.add("Four");
		list5.add("Five");
		list5.addFirst("Six");
		
		System.out.println();
		for (String string : list5) {
			System.out.println(string);
		}
		
		System.out.println();
	}
}

// чем отличаются очередь вектор стек и дек(deque)
// почему хэш - посмотреть
// c.180 глава 5 лафоре алгоритмы и структуры данных
// реализовать свой собсственный  двухсвяхный linkedList: LinkedList and Node - 2 класса, метод добавления нового элемента в конец начало в середину
