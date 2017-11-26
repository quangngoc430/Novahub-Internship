package BT_6_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeTest {
  
	Shape shape = new Shape() {
		
		@Override
		public double getPerimeter() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
  @Test
  public void testDefaultConstructor() {    
  	Shape shape = new Shape() {
  		
  		@Override
  		public double getPerimeter() {
  			// TODO Auto-generated method stub
  			return 0;
  		}
  		
  		@Override
  		public double getArea() {
  			// TODO Auto-generated method stub
  			return 0;
  		}
  	};
  	
    assertEquals("red", shape.getColor());
    assertEquals(true, shape.isFilled());
  }
  
  @Test
  public void testConstructor() {
		Shape shape = new Shape("pink", true) {
			
			@Override
			public double getPerimeter() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		assertEquals("pink", shape.getColor());
		assertEquals(true, shape.isFilled());
  }
  
  @Test
  public void testGetColor() {
	
		assertEquals("red", shape.getColor());
  }
  
  @Test
  public void testSetColor() {
		shape.setColor("green");
		
		assertEquals("green", shape.getColor());
  }
  
  @Test
  public void testIsFilled() {
  	shape.setFilled(true);
  	
		assertEquals(true, shape.isFilled());
  }
  
  @Test
  public void testSetFilled() {
		shape.setFilled(false);
		
		assertEquals(false, shape.isFilled());
  }
  
  @Test
  public void testToString() {
  	shape.setColor("red");
		
		shape.setFilled(true);
		assertEquals("A Shape with color of red and filled", shape.toString());
	  
		shape.setFilled(false);
		assertEquals("A Shape with color of red and Not filled", shape.toString());
		  
  }
}
