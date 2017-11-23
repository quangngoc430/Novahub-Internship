package BT_4_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CylinderTest {
	
	@Test
	public void testDefaultConstructor() {
		Cylinder cylinder = new Cylinder();
		
		assertEquals(1.0, cylinder.getRadius(), 2);
		assertEquals("red", cylinder.getColor());
		assertEquals(1.0, cylinder.getHeight(), 2);
	}
	
	@Test
	public void testConstructorWithOneArgument() {
		Cylinder cylinder = new Cylinder(13.76);
		
		assertEquals(13.76, cylinder.getRadius(), 2);
		assertEquals("red", cylinder.getColor());
		assertEquals(1.0, cylinder.getHeight(), 2);
	}

	@Test
	public void testConstructorWithTwoArguments() {
		Cylinder cylinder = new Cylinder(15, 7.8);
		
		assertEquals(15.00, cylinder.getRadius(), 2);
		assertEquals("red", cylinder.getColor());
		assertEquals(7.8, cylinder.getHeight(), 2);
	}

	@Test
	public void testConstructorWithThreeArguments() {
		Cylinder cylinder = new Cylinder(13.5, 9.8, "green");
		
		assertEquals(13.5, cylinder.getRadius(), 2);
		assertEquals("green", cylinder.getColor());
		assertEquals(9.8, cylinder.getHeight(), 2);
	}
	
	@Test
	public void testGetHeight() {
		Cylinder cylinder = new Cylinder();
		
		assertEquals(1.0, cylinder.getHeight(), 2);
	}
	
	@Test
	public void testSetHeight() {
		Cylinder cylinder = new Cylinder();
		cylinder.setHeight(1.95);
		
		assertEquals(1.95, cylinder.getHeight(), 2);
	}
	
	@Test
	public void testGetVolume() {
		Cylinder cylinder = new Cylinder(4.5, 10, "pink");
		
		assertEquals(636.17 , cylinder.getVolume(), 2);
	}
}








