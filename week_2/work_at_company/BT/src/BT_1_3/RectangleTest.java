package BT_1_3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest{

	@Test
	public void testDefaultConstructor() {	
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(4);
		rectangle.setWidth(5);
		
		assertEquals(rectangle.getWidth(), 5, 2);
		assertEquals(rectangle.getLength(), 4, 2);
	}
	
	@Test
	public void testConstructor() {
		Rectangle rectangle = new Rectangle(2, 3);
		
		assertEquals(rectangle.getLength(), 3, 2);
		assertEquals(rectangle.getWidth(), 2, 2);
	}
	
	@Test
	public void testSetLength() {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(2);
		
		assertEquals(2, rectangle.getLength(), 2);
	}
	
	@Test
	public void testGetLenght() {
		Rectangle rectangle = new Rectangle(6, 7);
		
		assertEquals(6, rectangle.getLength(), 2);
	}
	
	@Test
	public void testSetWidth() {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(5);
		
		assertEquals(5, rectangle.getWidth(), 2);
	}
	
	@Test
	public void testGetWidth() {
		Rectangle rectangle = new Rectangle(3, 9);
		
		assertEquals(9, rectangle.getWidth(), 2);
	}
	
	@Test
	public void testGetArea() {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(4);
		rectangle.setLength(7);
		
		assertEquals(4 * 7, rectangle.getArea(), 2);
	}
	
	@Test
	public void TestGetPerimeter() {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(5);
		rectangle.setLength(3);
		
		assertEquals((5 + 3) * 2, rectangle.getPerimeter(), 2);
	}
	
	@Test
	public void testToString() {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(4);
		rectangle.setLength(5);
		
		assertEquals("Rectangle[length=5.0,width=4.0]", rectangle.toString());
	}
	
}

