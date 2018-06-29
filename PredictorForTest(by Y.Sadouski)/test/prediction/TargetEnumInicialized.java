package prediction;

import org.junit.Assert;
import org.junit.Test;

public class TargetEnumInicialized extends InitializeBaseClassForTest {

	@Test
	public void test() {
		Assert.assertNotNull("Target was not initialized", calendar); // не null
	}
	
}
