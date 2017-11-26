package BT_4_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeTest {
  
  @Test
  public void testDefaultConstructor() {
    Shape shape = new Shape();
    
    assertEquals("red", shape.getColor());
    assertEquals(true, shape.isFilled());
  }
  
  @Test
  public void testConstructorWithTwoArguments() {
		Shape shape = new Shape("pink", true);
		
		assertEquals("pink", shape.getColor());
		assertEquals(true, shape.isFilled());
  }
  
  @Test
  public void testGetColor() {
		Shape shape = new Shape();
		
		assertEquals("red", shape.getColor());
  }
  
  @Test
  public void testSetColor() {
		Shape shape = new Shape();
		shape.setColor("green");
		
		assertEquals("green", shape.getColor());
  }
  
  @Test
  public void testIsFilled() {
		Shape shape = new Shape();
		
		assertEquals(true, shape.isFilled());
  }
  
  @Test
  public void testSetFilled() {
		Shape shape = new Shape();
		shape.setFilled(false);
		
		assertEquals(false, shape.isFilled());
  }
  
  @Test
  public void testToString() {
		Shape shape = new Shape();
		
		shape.setFilled(true);
		assertEquals("A Shape with color of red and filled", shape.toString());
	  
		shape.setFilled(false);
		assertEquals("A Shape with color of red and Not filled", shape.toString());
		  
  }
}
