import static org.junit.Assert.*;

import org.junit.Test;


public class HighwayTest {

	@Test
	public void testTest() {
		TollBooth t=new TollBooth("Test_Object");
		t.start();
		assertEquals(1, Highway.Test(t.forTestPurpose));
	}

}
