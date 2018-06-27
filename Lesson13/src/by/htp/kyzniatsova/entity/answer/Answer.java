package by.htp.kyzniatsova.entity.answer;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Answer implements Serializable{

	private static final long serialVersionUID = -8408735856090260114L;
	private String answer;
	
	public Answer() {
	}
	
	public Answer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
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
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		return true;
	}

	public static Queue<Answer> initAnswersLove(){
		Queue<Answer> answersLove = new LinkedList<Answer>();
		answersLove.add(new Answer("Happy love all life "));
		answersLove.add(new Answer("Love to 3 persons "));
		answersLove.add(new Answer("One love for all life "));
		return answersLove;
	}
	
	public static Queue<Answer> initAnswersFamily() {
		Queue<Answer> answers = new LinkedList<Answer>();
		answers.add(new Answer("You will have been always get together "));
		answers.add(new Answer("Happy family all life "));
		answers.add(new Answer("You will have 5 children "));
		return answers;
	}
	
	public static Queue<Answer> initAnswersFuture() {
		Queue<Answer> answers = new LinkedList<Answer>();
		answers.add(new Answer("You will have been living 100 years "));
		answers.add(new Answer("You will get rescue "));
		answers.add(new Answer("You will transform your body "));
		return answers;
	}
	
	public static Queue<Answer> initAnswersCareer() {
		Queue<Answer> answers = new LinkedList<Answer>();
		answers.add(new Answer("You will be a famous programmer "));
		answers.add(new Answer("You will work for Google "));
		answers.add(new Answer("You will deserve a promotion "));
		return answers;
	}
	
	@Override
	public String toString() {
		return  answer ;
	}


}
