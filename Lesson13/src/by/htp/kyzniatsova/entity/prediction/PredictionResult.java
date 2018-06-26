package by.htp.kyzniatsova.entity.prediction;

import java.io.Serializable;

import by.htp.kyzniatsova.entity.answer.Answer;

public class PredictionResult implements Serializable{

	private static final long serialVersionUID = -6148463416165849739L;
	private Prediction prediction;
	private Answer answer;
	String val;
	
	public PredictionResult() {
	}

	public PredictionResult(Prediction prediction, Answer answer) {
		this.prediction = prediction;
		this.answer = answer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((prediction == null) ? 0 : prediction.hashCode());
		result = prime * result + ((val == null) ? 0 : val.hashCode());
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
		PredictionResult other = (PredictionResult) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (prediction == null) {
			if (other.prediction != null)
				return false;
		} else if (!prediction.equals(other.prediction))
			return false;
		if (val == null) {
			if (other.val != null)
				return false;
		} else if (!val.equals(other.val))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return prediction + " || answer: " + answer;
	}
	

}
