package BT_4_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {
  
  @Test
  public void testDefaultConstructor() {
    Circle circle = new Circle();
    
    assertEquals(1.0, circle.getRadius(), 2);
  }
  
  @Test
  public void testConstructorWithOneArgument() {
    Circle circle = new Circle(2.5);
    
    assertEquals(2.5, circle.getRadius(), 2);
  }
  
  @Test
  public void testConstructorWithThreeArgumens() {
    Circle circle = new Circle(3.75, "green", false);
    
    assertEquals(3.75, circle.getRadius(), 2);
    assertEquals("green", circle.getColor());
    assertEquals(false, circle.isFilled());
  }
	
  @Test
  public void testGetRadius() {
	Circle circle = new Circle(9.5);
	
	assertEquals(9.5, circle.getRadius(), 2);
  }
  
  @Test
  public void testSetRadius() {
	Circle circle = new Circle();
	circle.setRadius(10.75);
	
	assertEquals(10.75, circle.getRadius(), 2);
  }
  
  @Test
  public void testGetArea() {
	Circle circle = new Circle(4.0);
		
	assertEquals(16 * Math.PI, circle.getArea(), 2);
  }
  
  @Test
  public void testGetPerimeter() {
	Circle circle = new Circle(4.0);
	
	assertEquals(8 * Math.PI, circle.getPerimeter(), 2);
  }
  
  @Test
  public void testToString() {
	Circle circle = new Circle(3.0, "blue", true);
	
	assertEquals("A Circle with radius=3.0, which is a subclass of A Shape with color of blue and filled", circle.toString());	
  }
}
