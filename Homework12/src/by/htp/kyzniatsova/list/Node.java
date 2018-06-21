package by.htp.kyzniatsova.list;

import by.htp.kyzniatsova.entity.User;

public class Node {
	
	private User dData;
	private Node next;
	private Node previous;
	
	public Node(User d) {
		dData = d;
		next = null;
		previous = null;
	}
	
	public void display() {
		System.out.println(dData + " ");
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	public User getDData() {
		return dData;
	}

	public void setDData(User dData) {
		this.dData = dData;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dData == null) ? 0 : dData.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (dData == null) {
			if (other.dData != null)
				return false;
		} else if (dData.equals(other.dData))
			return false;
		return true;
	}
	
	
	
	

}
