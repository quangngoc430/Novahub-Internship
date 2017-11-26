package BT_5_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {
	
	@Test
	public void testConstructorWithTwoArguments() {
		Point point = new Point(3, 4);
		
		assertEquals(3, point.getX());
		assertEquals(4, point.getY());
	}
	
	@Test
	public void testGetX() {
		Point point = new Point(4, 5);
		
		assertEquals(4, point.getX());
	}
	
	@Test
	public void testSetX() {
		Point point = new Point(5, 7);
		point.setX(9);
		
		assertEquals(9, point.getX());
	}
	
	@Test
	public void testGetY() {
		Point point = new Point(7, 9);
		
		assertEquals(9, point.getY());
	}
	
	@Test
	public void testSetY() {
		Point point = new Point(3, 8);
		point.setY(10);
		
		assertEquals(10, point.getY());
	}
	
	@Test
	public void testSetXY() {
		Point point = new Point(3, 4);
		point.setXY(6, 9);
		
		assertEquals(6, point.getX());
		assertEquals(9, point.getY());
	}
	
	@Test
	public void testToString() {
		Point point = new Point(4, 9);
		
		assertEquals("Point: (4,9)", point.toString());
	}
}
