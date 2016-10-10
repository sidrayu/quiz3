package quiz3;


import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class triangleTest {
	Triangle triangle1 = new Triangle (3.0, 4.0, 5.0);
	
	@Test
	public void testGetArea_true() {
		double expectedValue = 6.0;
		assertEquals(expectedValue == triangle1.getArea(), true);
	}
	
	
	@Test
	public void testGetPerimeter_true() {
		double expectedValue2 = 12.0;
		assertEquals(expectedValue2 == triangle1.getPerimeter(), true);
	}
	
}
