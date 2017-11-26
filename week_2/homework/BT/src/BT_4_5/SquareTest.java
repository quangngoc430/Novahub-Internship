package BT_4_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

  @Test
  public void testDefaultConstructor() {
    Square square = new Square();
    
    assertEquals(1.0, square.getLength(), 2);
    assertEquals(1.0, square.getWidth(), 2);
  }
  
  @Test
  public void testConstructor() {
	Square square = new Square(2.5);
	
	assertEquals(2.5, square.getSide(), 2);
  }
  
  @Test
  public void testSetSide() {
	Square square = new Square();
	square.setSide(3.0);
	
	assertEquals(3.0, square.getSide(), 2);
  }
  
  @Test
  public void testGetSide() {
	Square square = new Square();
	square.setSide(9.5);
	
	assertEquals(9.5, square.getSide(), 2);
  }
  
  @Test
  public void testSetWidth() {
	Square square = new Square();
	square.setWidth(3.6);
	
	assertEquals(3.6, square.getWidth(), 2);
  }
  
  @Test
  public void testSetLength() {
	Square square = new Square();
	square.setLength(5.9);
	
	assertEquals(5.9, square.getLength(), 2);
  }
  
  @Test
  public void testToString() {
	Square square = new Square();
	square.setSide(3.0);
	
	assertEquals("A Square with side=3.0, which is a subclass of A Rectangle with width=3.0 and length=3.0, which is a subclass of A Shape with color of red and filled", square.toString());
  }
}
