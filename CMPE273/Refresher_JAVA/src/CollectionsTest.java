import static org.junit.Assert.*;

import org.junit.Test;


public class CollectionsTest {
Collections a=new Collections();
	
@Test
public void testDispatch()throws Exception {
	int expected=1;
	assertEquals(expected, a.repair());
}
@Test
	public void testRepair()throws Exception {
		int expected=1;
		assertEquals(expected, a.dispatch());
	}

	

}
