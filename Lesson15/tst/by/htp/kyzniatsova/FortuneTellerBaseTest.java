package by.htp.kyzniatsova;

import by.htp.kyzniatsova.*;
import org.junit.Before;

public class FortuneTellerBaseTest {
	
	protected FortuneTeller teller; // является ли ссылка null
	
	@Before
	public void initTeller() {
		teller = new Fortune();
	}

}
