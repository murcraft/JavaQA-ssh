package by.htp.kyzniatsova;
import org.junit.Test;

public class FortuneTellerCorrectPredictionType  extends FortuneTellerBaseTest{
	
	@Test(expected = WrongPredictionType.class) // должен быть выброшен exception - негативный тест
	public void testInCorrectType() {
		
		String result = teller.predict("ldfdove");
	}

}
