package by.htp.predictor.been;

public class Answer {
	String answer;

	public Answer() {
		super();
		
	}

	public Answer(String answer) {
		this.answer = answer;
	}

	public synchronized String getAnswer() {
		return answer;
	}

	public synchronized void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String toString() {
		return "Answer :" + answer ;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		return result;
	}


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
	
	

}
