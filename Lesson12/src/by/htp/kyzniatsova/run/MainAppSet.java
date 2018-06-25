package by.htp.kyzniatsova.run;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import by.htp.kyzniatsova.entity.SortComparator;
import by.htp.kyzniatsova.entity.User;

public class MainAppSet {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("One");
		set1.add("Two");
		set1.add("Three");
		set1.add("Four");
		set1.add("Five");
		set1.add("Two");
		set1.add("Four");
		
		for (String s : set1) {
			System.out.println(s.hashCode());
		}
		
		Set<User> set2 = new HashSet<>();
		set2.add(new User(25, "Kate"));
		set2.add(new User(25, "Kate"));
		set2.add(new User(23, "Olga"));
		set2.add(new User(18, "Ivan"));
		set2.add(new User(25, "Petr"));
		set2.add(new User(25, "Yury"));
		
		for (User s : set2) {
			System.out.println(s);
		}
		System.out.println("---------------------------");
		
		//------------
		//упорядоченный
		Set<User> set3 = new LinkedHashSet<>();
		
		set2.add(new User(25, "Kate"));
		set2.add(new User(23, "Olga"));
		set2.add(new User(18, "Ivan"));
		set2.add(new User(25, "Petr"));
		set2.add(new User(25, "Yury"));
		set2.add(new User(25, "Kate"));
		
		for (User s : set2) {
			System.out.println(s);
		}
		
		
System.out.println("---------------------------");
		// с сортировкой

		Set<String> set4 = new TreeSet<>();
		
		set4.add("One");
		set4.add("Two");
		set4.add("Three");
		set4.add("Four");
		set4.add("Five");
	
		
		for (String s : set4) {
			System.out.println(s);
		}
		
System.out.println("---------------------------");
		
		//------------
		//упорядоченный
		Set<User> set5 = new TreeSet<>(new SortComparator());
		
		set5.add(new User(25, "Kate"));
		set5.add(new User(23, "Olga"));
		set5.add(new User(18, "Ivan"));
		set5.add(new User(25, "Petr"));
		set5.add(new User(25, "Yury"));
		set5.add(new User(25, "Kate"));
		
		for (User s : set5) {
			System.out.println(s);
		}

	}

}
