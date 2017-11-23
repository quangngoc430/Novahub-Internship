package BT_2_7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testDefaultConstructor() {
		Customer customer = new Customer();
		customer.setID(1);
		customer.setName("customer 1");
		customer.setDiscount(450000);
		
		assertEquals(1, customer.getID());
		assertEquals("customer 1", customer.getName());
		assertEquals(450000, customer.getDiscount());
	}
	
	@Test
	public void testConstructor() {
		Customer customer = new Customer(1, "Ngoc", 500000);
		
		assertEquals(1, customer.getID());
		assertEquals("Ngoc", customer.getName());
		assertEquals(500000 , customer.getDiscount());
	}
	
	@Test
	public void testSetID() {
		Customer customer = new Customer();
		customer.setID(2);
		
		assertEquals(2, customer.getID());
	}
	
	@Test
	public void testSetId() {
		Customer customer = new Customer();
		customer.setID(15);
		
		assertEquals(15, customer.getID());
	}
	
	@Test
	public void testGetID() {
		Customer customer = new Customer(1, "Ngoc", 500000);
		
		assertEquals(1, customer.getID());
	}
	
	@Test
	public void testSetName() {
		Customer customer = new Customer();
		customer.setName("Hai");
		
		assertEquals("Hai", customer.getName());
	}
	
	@Test
	public void testGetName() {
		Customer customer = new Customer(2, "Hai", 25000);
		
		assertEquals("Hai", customer.getName());
	}
	
	@Test
	public void testSetDiscount() {
		Customer customer = new Customer();
		customer.setDiscount(45000);
		
		assertEquals(45000, customer.getDiscount());
	}
	
	@Test
	public void testGetDiscount() {
		Customer customer = new Customer(3, "Thanh", 49000);
	
		assertEquals(49000, customer.getDiscount());
	}
	
	@Test
	public void testToString() {
		Customer customer = new Customer(1, "Ngoc Bui", 49999);
		
		assertEquals("Ngoc Bui(1)", customer.toString());		
	}
}
