package by.htp.kyzniatsova;

public class Fortune implements FortuneTeller{
	

	@Override
	public String predict(String type) {
		String result = null;
		switch(type) {
		case "love":
			result = "yes";
			break;
		case "money":
			result = "yes";
			break;
		case "home":
			result = "yes";
			break;
//			default:
//				throw new WrongPredictionType();
		}
		return result;
		
	}

}
