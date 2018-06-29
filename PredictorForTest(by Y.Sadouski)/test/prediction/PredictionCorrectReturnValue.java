package prediction;

import org.junit.Assert;
import org.junit.Test;

public class PredictionCorrectReturnValue extends InitializeBaseClassForTest{
	
	
	@Test
	public void testClientPredictionNotNull() {
		String result = client.predictionResult(prediction, answer, calendar);
		Assert.assertNotNull("Client returned empty result", result); 
	}
	
	@Test
	public void testClientPredictionNotEmpty() {
		String result = client.predictionResult(prediction, answer, calendar);
		Assert.assertFalse("We got empty prediction", result.isEmpty());
	}

}
