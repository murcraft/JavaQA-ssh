package prediction;

import org.junit.Assert;
import org.junit.Test;

public class CalendarInitialized extends InitializeBaseClassForTest {
	
	@Test
	public void test() {
		Assert.assertNotNull("Calendar was not initialized", calendar); // не null
	}
	
}
