import static org.junit.Assert.*;

import org.junit.Test;


public class QueueTest {
	
	Queue q= new Queue();

	@Test
	public void testService()throws Exception {
		q.accept(0);
		q.show(0);
		assertEquals(1,Queue.Service(q.for_test_purpose));
	}

}
