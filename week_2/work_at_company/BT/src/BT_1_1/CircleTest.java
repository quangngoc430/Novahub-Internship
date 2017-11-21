package BT_1_1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest{

	@Test
	public void testConstructor() {
		Circle circle = new Circle(3.0, "green");
		
		assertEquals(circle.getRadius(), circle.getRadius(), 2);
		assertEquals("green", circle.getColor());
	}
	
	@Test
	public void testSetRadius(){
		Circle circle = new Circle();
		circle.setRadius(1.0);

		assertEquals(1.0, circle.getRadius(), 2);
	}

	@Test
	public void testGetRadius() {
		Circle circle = new Circle(2.5, "red");
		
		assertEquals(2.5, circle.getRadius(), 2);
	}
	
	@Test
	public void testSetColor(){
		Circle circle = new Circle();
		circle.setColor("blue");

		assertEquals("blue", circle.getColor());
	}
	
	@Test
	public void testGetColor() {
		Circle circle = new Circle(6.7, "green");
		
		assertEquals("green", circle.getColor());
	}

	@Test
	public void testSetArea(){
		Circle circle = new Circle();
		circle.setRadius(1.0);

		assertEquals(1 * 1 * Math.PI, circle.getArea(), 2);
	}

	@Test
	public void testToString(){
		Circle circle = new Circle();
		circle.setRadius(2.0);
		circle.setColor("red");

		assertEquals("Circle[radius=2.0,color=red]", circle.toString());
	}
}