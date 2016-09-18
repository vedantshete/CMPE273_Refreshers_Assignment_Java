import static org.junit.Assert.*;

import org.junit.Test;

public class MyGenericsTest {

	@Test
	public void returnmethodtest() {
		
		String name_1 = "Vedant";
		String major_1 = "SE";
		double gpa_1 = 3.7;
		
		MyGenerics obj1 = new MyGenerics();
		obj1.setdata(name_1,major_1,gpa_1);
		
		assertEquals(obj1.returnmethod(),3.7);
	}

}
