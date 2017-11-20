package Circle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest{

	@Test
	public void testGetRadius(){
		Circle circle = new Circle();
		circle.setRadius(1.0);

		assertEquals(1.0, circle.getRadius(), 2);
	}

	@Test
	public void testGetColor(){
		Circle circle = new Circle();
		circle.setColor("blue");

		assertEquals("blue", circle.getColor());
	}

	@Test
	public void testGetArea(){
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