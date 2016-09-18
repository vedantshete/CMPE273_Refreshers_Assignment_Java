import static org.junit.Assert.*;

import org.junit.Test;

public class CakeListTest {

	@Test
	public void CheckTest() {
		CakeList obj1 = new CakeList();
		obj1.cakeList.add("Vanilla");
		String x = "Vanilla";
		assertEquals(obj1.Check(x),true);
	}
}
