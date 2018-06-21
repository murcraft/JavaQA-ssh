package by.htp.kyzniatsova.list;

import by.htp.kyzniatsova.entity.User;

public class LinkedList {
	private Node first;
	private Node last;
	
	public LinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(User dd) {
		Node newLink = new Node(dd);
		if(isEmpty()) {
			last = newLink;
		} else {
			first.setPrevious(newLink);
		}
			newLink.setNext(first);
			first = newLink;	
	}
	
	public void insertLast(User dd) {
		Node newLink = new Node(dd);
		if(isEmpty()) {
			first = newLink;
		} else {
			last.setNext(newLink);
			newLink.setPrevious(last);
		}
		last = newLink;
	}
	
	public boolean insertAfter(User key, User dd) {
		Node current = first;
		while(current.getDData().equals(key)) {
			current = current.getNext();
			if(current == null) {
				return false;
			}
		}
		Node newLink = new Node(dd);
		if(current == last) {
			newLink.setNext(null);
			last = newLink;
		} else {
			newLink.setNext(current.getNext());
			current.getNext().setPrevious(newLink);
		}
		newLink.setPrevious(current);
		current.setNext(newLink);
		return true;		
	}
	
	public Node deleteKey(User key) {
		Node current = first;

		while(!current.getDData().equals(key)) {
			current = current.getNext();
			if(current == null) {
				return null;
			}
		}
		if(current == first) {
			first = current.getNext();
		} else {
			current.getPrevious().setNext(current.getNext());
		}
		if(current== last) {
			last =current.getPrevious();
		} else {
			current.getNext().setPrevious(current.getPrevious());
		}
		return current;
		
		
	}
	public void displayForw() {
		System.out.println("List (first -- last): ");
		Node current = first;
		while(current != null) {
			current.display();
			current = current.getNext();
		}
		System.out.println(" ");
	}


}
