package prediction;

import org.junit.Assert;
import org.junit.Test;

public class ClientInitialize extends InitializeBaseClassForTest{

	@Test
	public void test() {
		Assert.assertNotNull("Client was not initialized", client); // не null
	}
	
}

