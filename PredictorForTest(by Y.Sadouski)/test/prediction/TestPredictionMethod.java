package prediction;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.junit.Ignore;
import org.junit.Test;


import by.htp.predictor.been.Answer;
import by.htp.predictor.been.Client;
import by.htp.predictor.been.PredictionEnum;
import junit.framework.Assert;

public class TestPredictionMethod extends InitializeBaseClassForTest {
	
	
	@Test
	public void test() {
		Assert.fail(client.predictionResult(prediction, answer, calendar));
	}
	
	
	@Test//(expected = WrongPredictionType.class) // должен быть выброшен exception - негативный тест
	public void testInCorrectType() {
		
		String result = " Prediction <" + client.predictionResult(PredictionEnum.LOVE, new Answer("Fortunately, You will meet yout love today!"), calendar);
	}

}
