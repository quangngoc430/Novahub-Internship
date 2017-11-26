package BT_5_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CylinderTest {
	
	@Test
	public void testDefaultConstructor() {
		Cylinder cylinder = new Cylinder();
		
		assertEquals(1.0, cylinder.getBase().getRadius(), 2);
		assertEquals("red", cylinder.getBase().getColor());
		assertEquals(1.0, cylinder.getHeight(), 2);
	}
	
	@Test
	public void testConstructorWithOneArgument() {
		Cylinder cylinder = new Cylinder(13.76);
		
		assertEquals(13.76, cylinder.getBase().getRadius(), 2);
		assertEquals("red", cylinder.getBase().getColor());
		assertEquals(1.0, cylinder.getHeight(), 2);
	}

	@Test
	public void testConstructorWithTwoArguments() {
		Cylinder cylinder = new Cylinder(15, 7.8);
		
		assertEquals(15.00, cylinder.getBase().getRadius(), 2);
		assertEquals("red", cylinder.getBase().getColor());
		assertEquals(7.8, cylinder.getHeight(), 2);
	}

	@Test
	public void testConstructorWithThreeArguments() {
		Cylinder cylinder = new Cylinder(13.5, 9.8, "green");
		
		assertEquals(13.5, cylinder.getBase().getRadius(), 2);
		assertEquals("green", cylinder.getBase().getColor());
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
	public void testGetBase() {
		Cylinder cylinder = new Cylinder();
		
		assertEquals(1.0, cylinder.getBase().getRadius(), 2);
		assertEquals("red", cylinder.getBase().getColor());
	}
	
	@Test
	public void testSetBase() {
		Cylinder cylinder = new Cylinder();
		
		Circle circle = new Circle(2.5, "green");
		cylinder.setBase(circle);
		
		assertEquals(2.5, cylinder.getBase().getRadius(), 2);
		assertEquals("green", cylinder.getBase().getColor());
	}
	
	@Test
	public void testGetVolume() {
		Cylinder cylinder = new Cylinder(4.5, 10, "pink");
		
		assertEquals(636.17 , cylinder.getVolume(), 2);
	}
}








