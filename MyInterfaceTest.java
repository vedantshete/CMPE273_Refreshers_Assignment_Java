import static org.junit.Assert.*;

import org.junit.Test;

public class MyInterfaceTest {

	@Test
	public void speedcontroltest() {
	MyInterface obj = new MyInterface();
	assertEquals(obj.speedcontrol(),true);
	
	}
}
