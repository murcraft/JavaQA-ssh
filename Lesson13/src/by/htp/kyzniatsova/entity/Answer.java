package by.htp.kyzniatsova.entity;

import java.util.LinkedList;
import java.util.List;


public class Answer {
	
	private int id;
	List<String> answ = null;
	
	public Answer(int id) {
		super();
		this.setId(id);
		answ = showAnswer(id);
	}
	
	public static List<String> showAnswer(int id) {
		List<String> answ = null;
		if(id == 1) {
			answ = new LinkedList<String>();
			answ.add("happy love all life");
			answ.add("love to 3 persons");
			answ.add("one love for all life");
			answ.add("you'll meet in 3 years");
			answ.add("you'll meet tomorrow");
			return answ;
		}
		if(id == 2) {
			answ = new LinkedList<String>();
			answ.add("You will have been living 100 years");
			answ.add("You will get rescue");
			answ.add("You will transform your body");
			answ.add("You won't die");
			return answ;
		}
		
		if(id == 3) {
			answ = new LinkedList<String>();
			answ.add("You will have been always get together");
			answ.add("Happy family all life");
			answ.add("You will have 5 children");
			return answ;
		}
		if(id == 4) {
			answ = new LinkedList<String>();
			answ.add("You will have been living 100 years");
			answ.add("You will get rescue");
			answ.add("You will transform your body");
			answ.add("You won't die");
			return answ;
		}
		if(id == 5) {
			answ = new LinkedList<String>();
			answ.add("You will have been living 100 years");
			answ.add("You will get rescue");
			answ.add("You will transform your body");
			answ.add("You won't die");
			return answ;
		}
		if(id == 6) {
			answ = new LinkedList<String>();
			answ.add("You will have been living 100 years");
			answ.add("You will get rescue");
			answ.add("You will transform your body");
			answ.add("You won't die");
			return answ;
		}
		return answ;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answ == null) ? 0 : answ.hashCode());
		result = prime * result + id;
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
		Answer other = (Answer) obj;
		if (answ == null) {
			if (other.answ != null)
				return false;
		} else if (!answ.equals(other.answ))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Answer " + id + ", answ: " + answ;
	}
	
	

}
