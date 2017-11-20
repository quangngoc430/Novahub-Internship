package Circle_1_2;

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
	public void testGetArea(){
		Circle circle = new Circle();
		circle.setRadius(2.0);

		assertEquals(2 * 2 * Math.PI, circle.getArea(), 2);
	}

	@Test
	public void testGetCircumference(){
		Circle circle = new Circle();
		circle.setRadius(3.0);

		assertEquals(3.0 * 2 * Math.PI, circle.getCircumference(), 2);
	}

	@Test
	public void testToString(){
		Circle circle = new Circle();
		circle.setRadius(2.0);

		assertEquals("Circle[radius=2.0]", circle.toString());
	}
}