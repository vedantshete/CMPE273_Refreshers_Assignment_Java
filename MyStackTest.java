import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void pushtest() {
		MyStack obj = new MyStack();
		obj.push("White");
		obj.push("Blue");
		obj.push("Black");
		obj.push("Orange");
		obj.push("Red");
		assertEquals(obj.push("Stack is empty."));
	}

}
