package by.htp.kyzniatsova.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Answer {
	
	private int id;
	private String answ;
	private Queue<String> quest = null;
	
	
	public Answer() {
	}
	
	public Answer(Target t) {
		this.id = t.ordinal();
		this.answ = answ;
		quest = new LinkedList<String>();
		quest = showLoveAnswer(id);
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Queue<String> showLoveAnswer(int id){
		Queue<String> quest = new LinkedList<String>();
		if(id == 0) {
		quest.add("Happy love all life ");
		quest.add("Love to 3 persons ");
		quest.add("One love for all life ");
		quest.add("You'll meet tomorrow ");
		return quest;
		}
	
		if(id == 1) {
			quest.add("You will have been living 100 years ");
			quest.add("You will get rescue ");
			quest.add("You will transform your body ");
			quest.add("You won't die ");
		return quest;
		}
		if(id == 2) {
			quest.add("You will have been always get together ");
			quest.add("Happy family all life ");
			quest.add("You will have 5 children ");
		
		return quest;
	}
	
		if(id == 3) {
			quest.add("You will be a famous programmer ");
			quest.add("You will work for Google ");
			quest.add("You will deserve a promotion ");
		
		return quest;
	}
	
		if(id == 4) {
		quest.add("You will have been living 100 years ");
		quest.add("You will get rescue ");
		quest.add("You will transform your body ");
		quest.add("You won't die ");
		
		return quest;
	}
	
		if(id == 5) {
			quest.add("You will get a cat ");
			quest.add("You will have a dog; ");
			quest.add("You will have 3 cats for you life ");
			quest.add("Your cat will have been livig with you all life ");
		
		return quest;
	}
		return quest;
	}

	@Override
	public String toString() {
		return quest.toString();
	}

	

	
	

}
