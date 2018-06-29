package prediction;

import org.junit.Assert;
import org.junit.Test;

public class AnswerInitialized extends InitializeBaseClassForTest {
	@Test
	public void test() {
		Assert.assertNotNull("Answer was not initialized", calendar); // не null
	}
	
}
