package by.htp.kyzniatsova.entity;

public class PredictionResult {
	private Prediction prediction;
	private Answer answer;
	String val;
	
	public PredictionResult(Prediction prediction, Answer answer) {
		this.prediction = prediction;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "PredictionResult " + prediction + " answe " + answer;
	}
	
	

}
