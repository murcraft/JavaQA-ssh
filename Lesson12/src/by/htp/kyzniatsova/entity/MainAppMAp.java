package by.htp.kyzniatsova.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainAppMAp {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1,  "One");
		map.put(2,  "Two");
		map.put(3,  "Three");
		map.put(4,  "Four");
		map.put(5,  "Five");
		map.put(100,  "hundred");
		
		Set <Entry<Integer, String>> entry = map.entrySet(); // множество пар ключ-значение
		Set <Integer> keys = map.keySet();// получили набор ключей 
		
		for(Integer i : keys) {
			System.out.println(map.get(i));
		}
		System.out.println("--------------");
		
		for (int i = 1; i < map.size() + 1; i++) {
			System.out.println(map.get(i));
		}
		
		System.out.println(map.values());
		

	}

}
