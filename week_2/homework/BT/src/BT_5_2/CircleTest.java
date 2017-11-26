package BT_5_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {
	
	@Test
	public void testDefaultConstructor() {
		Circle circle = new Circle();
		
		assertEquals(1.0, circle.getRadius(), 2);
		assertEquals("red", circle.getColor());
	}
	
	@Test
	public void testConstructorWithOneArgument() {
		Circle circle = new Circle(3.7);
		
		assertEquals(3.7, circle.getRadius(), 2);
	}
	
	@Test
	public void testConstructorWithTwoArguments() {
		Circle circle = new Circle(2.5, "green");
		
		assertEquals(2.5, circle.getRadius(), 2);
		assertEquals("green", circle.getColor());
	}
	
	@Test
	public void testGetRadius() {
		Circle circle = new Circle();
		
		assertEquals(1.0, circle.getRadius(), 2);
	}
	
	@Test
	public void testSetRadius() {
		Circle circle = new Circle();
		circle.setRadius(10.5);
		
		assertEquals(10.5, circle.getRadius(), 2);
	}
	
	@Test
	public void testGetColor() {
		Circle circle = new Circle();
		
		assertEquals("red", circle.getColor());
	}
	
	@Test
	public void testSetColor() {
		Circle circle = new Circle();
		circle.setColor("blue");
		
		assertEquals("blue", circle.getColor());
		
	}
	
	@Test
	public void testGetArea() {
		Circle circle = new Circle();
		circle.setRadius(10);
		
		assertEquals(314.17 , circle.getArea(), 2);
	}
	
	@Test
	public void testToString() {
		Circle circle = new Circle();
	
		assertEquals("Circle[radius=1.0,color=red]", circle.toString());
	}
}















