import static org.junit.Assert.*;

import org.junit.Test;


public class stacksTest {

	stacks s;
	@Test
	public void testRelease()throws Exception {
		s=new stacks();
		s.accept();
		assertEquals(1,s.release());
		
	}

}
