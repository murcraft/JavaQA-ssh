package by.htp.kyzniatsova.run;

import by.htp.kyzniatsova.entity.User;
import by.htp.kyzniatsova.list.LinkedList;

public class LinkedApp {

	public static void main(String[] args) {
		User user1 = new User(12, "Helen");
		User user2 = new User(13, "Kate");
		User user3 = new User(12, "Maria");
		User user4 = new User(11, "Egor");
		
		LinkedList list = new LinkedList();
		list.insertFirst(user1);
		list.insertFirst(user2);
		list.displayForw();
		
		list.insertLast(user3);
		list.insertLast(user4);
		
		list.displayForw();
		
		list.deleteKey(user4);
		
		list.displayForw();
		
//		list.insertAfter(User(15, "Svatlana"), new User(15, "Svatlana");
//		list.insertAfter(33, 88);


	}

}
