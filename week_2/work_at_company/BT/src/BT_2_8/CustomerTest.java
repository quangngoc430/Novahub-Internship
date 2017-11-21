package BT_2_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testDefaultConstructor() {
		Customer customer = new Customer();
		customer.setID(1);
		customer.setName("Customer 1");
		customer.setGender('m');
		
		assertEquals(1, customer.getID());
		assertEquals("Customer 1", customer.getName());
		assertEquals('m', customer.getGender());
	}
	
	@Test
	public void testConstructor() {
		Customer customer = new Customer(2, "Customer 2", 'f');
		
		assertEquals(2, customer.getID());
		assertEquals("Customer 2", customer.getName());
		assertEquals('f', customer.getGender());
	}
	
	@Test
	public void testSetID() {
		Customer customer = new Customer();
		customer.setID(10);
		
		assertEquals(10, customer.getID());
	}
	
	@Test
	public void testGetID() {
		Customer customer = new Customer(12, "Customer 12", 'f');
		
		assertEquals(12, customer.getID());
	}
	
	@Test
	public void testSetName() {
		Customer customer = new Customer();
		customer.setName("Customer 420");
		
		assertEquals("Customer 420", customer.getName());
	}
	
	@Test
	public void testGetName() {
		Customer customer = new Customer(14, "Customer 14", 'f');
		customer.setName("Ngoc");
		
		assertEquals("Ngoc", customer.getName());
	}
	
	@Test
	public void testSetGender() {
		Customer customer = new Customer();
		customer.setGender('m');
		
		assertEquals('m', customer.getGender());
	}
	
	@Test
	public void testGetGender() {
		Customer customer = new Customer(3, "Customer 3", 'm');
		
		assertEquals('m', customer.getGender());
	}
	
	@Test
	public void testToString() {
		Customer customer = new Customer(113, "Hai", 'm');
		
		assertEquals("Hai(113)", customer.toString());
	}
	
}
