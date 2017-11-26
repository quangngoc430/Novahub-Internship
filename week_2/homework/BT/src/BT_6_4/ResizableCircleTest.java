package BT_6_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResizableCircleTest {
	
	@Test
	public void TestConstructorWithOneArgumenet() {
		ResizableCircle resizableCircle = new ResizableCircle(3.45);
		
		assertEquals(3.45, resizableCircle.getRadius(), 2);
	}
	
	@Test
	public void testResize() {
		ResizableCircle resizableCircle = new ResizableCircle(10.0);
		resizableCircle.resize(70);
		
		assertEquals(7.0, resizableCircle.getRadius(), 2);
	}
}
