import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testEmptyQ() {
		Queue obj1 = new Queue();
		assertEquals(obj1.EmptyQ(), true);

	}

}
