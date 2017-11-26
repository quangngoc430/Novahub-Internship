package BT_4_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest {

  @Test
  public void testDefaultConstructor() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(1.0, rectangle.getWidth(), 2);
		assertEquals(1.0, rectangle.getLength(), 2);
  }
  
  @Test
  public void testConstructorWithTwoArgurments() {
		Rectangle rectangle = new Rectangle(2.5, 3.7);
		
		assertEquals(2.5, rectangle.getWidth(), 2);
		assertEquals(3.7, rectangle.getLength(), 2);
		assertEquals("red", rectangle.getColor());
		assertEquals(true, rectangle.isFilled());
  }
  
  @Test
  public void testConstructorWithFourArguments() {
			Rectangle rectangle = new Rectangle(2.5, 3.7, "purple", false);
			
			assertEquals(2.5, rectangle.getWidth(), 2);
			assertEquals(3.7, rectangle.getLength(), 2);
			assertEquals("purple", rectangle.getColor());
			assertEquals(false, rectangle.isFilled());
  }  
  
  @Test
  public void testGetWidth() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(1.0, rectangle.getWidth(), 2);
  }
  
  @Test
  public void testSetWidth() {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(3.76);
		
		assertEquals(3.76, rectangle.getWidth(), 2);
  }
  
  @Test
  public void testGetLength() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(1.0, rectangle.getLength(), 2);
  }
  
  @Test
  public void testSetLength() {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(9.57);
		
		assertEquals(9.57, rectangle.getLength(), 2);
  }
  
  @Test
  public void testGetArea() {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(2.5);
		rectangle.setWidth(2);
		
		assertEquals(5.0, rectangle.getArea(), 2);
  }
  
  @Test
  public void testGetPerimeter() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(2.0, rectangle.getPerimeter(), 2);
  }
  
  @Test
  public void testToString() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals("A Rectangle with width=1.0 and length=1.0, which is a subclass of A Shape with color of red and filled", rectangle.toString());
	}
}








