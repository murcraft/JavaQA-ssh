package by.htp.kyzniatsova.entity;

import java.util.LinkedList;
import java.util.Queue;

public class AnswerQueue {
	
	private Answer answer = null;
	Queue<Answer> answersLove = null;
	
	public AnswerQueue() {
	}

	public AnswerQueue(Answer answer) {
//		this.answer = answer;
		this.answersLove = new LinkedList<Answer>();
	}
	
	
	
	

}
