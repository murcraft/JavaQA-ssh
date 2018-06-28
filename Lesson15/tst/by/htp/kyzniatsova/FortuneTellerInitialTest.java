package by.htp.kyzniatsova;

import org.junit.Before;
import org.junit.Test;

import by.htp.kyzniatsova.*;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FortuneTellerInitialTest extends FortuneTellerBaseTest{

	@Test
	public void test() {
		Assert.assertNotNull("Teller was not initialized", teller); // не null
	}
	
	@Test
	public void testTellerPredictionNotNull() {
		String result = teller.predict("love");
		Assert.assertNotNull("Teller returned empty result", result); // не пустая строка
	}
	
	@Test
	public void testTellerPredictionNotEmpty() {
		String result = teller.predict("love");
		Assert.assertFalse("We got empty prediction", result.isEmpty());
	}

}
