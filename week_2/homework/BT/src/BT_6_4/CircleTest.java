package BT_6_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testDefaultConstructor() {
		Circle circle = new Circle();
		
		assertEquals(1.0, circle.getRadius(), 2);
	}
	
	@Test
	public void testConstructorWithOneArguments() {
		Circle circle = new Circle(2.5);
		
		assertEquals(2.5, circle.getRadius(), 2);
	}
	
	@Test
	public void testSetRadius() {
		Circle circle = new Circle();
		circle.setRadius(3.75);
		
		assertEquals(3.75, circle.getRadius(), 2);
	}
	
	@Test
	public void testGetRadius() {
		Circle circle = new Circle();
		
		assertEquals(1.0, circle.getRadius(), 2);
	}
	
	@Test
	public void testGetPerimeter() {
		Circle circle = new Circle();
		
		assertEquals(6.28, circle.getPerimeter(), 2);
	}
	
	@Test
	public void testGetArea() {
		Circle circle = new Circle();
		
		assertEquals(3.14, circle.getArea(), 2);
	}
	
}
