package BT_2_7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceTest {
	
	Customer customer = new Customer(1, "Ngoc", 40000);
	
	@Test
	public void testDefaultConstructor() {
		Invoice invoice = new Invoice();
		invoice.setID(2);
		invoice.setCustomer(customer);
		invoice.setAmount(50000);
		
		assertEquals(2, invoice.getID());
		assertEquals("Ngoc(1)", invoice.getCustomer().toString());
		assertEquals(50000, invoice.getAmount(), 2);
	}
	
	@Test
	public void testConstructor() {
		Invoice invoice = new Invoice(3, customer, 54000);

		assertEquals(3, invoice.getID());
		assertEquals("Ngoc(1)", invoice.getCustomer().toString());
		assertEquals(54000, invoice.getAmount(), 2);
	}
	
	@Test
	public void testSetID() {
		Invoice invoice = new Invoice();
		invoice.setID(1);
		
		assertEquals(1, invoice.getID());
	}
	
	@Test
	public void testSetAmount() {
		Invoice invoice = new Invoice();
		invoice.setAmount(75.500);
		
		assertEquals(75.500, invoice.getAmount(), 2);
	}
	
	@Test
	public void testSetCustomer() {
		Invoice invoice = new Invoice();
		invoice.setCustomer(customer);
		
		assertEquals("Ngoc(1)", invoice.getCustomer().toString());
	}
	
	@Test
	public void testGetID() {
		Invoice invoice = new Invoice(1, customer, 75000);

		assertEquals(1, invoice.getID());
	}
	
	@Test
	public void testGetCustomer() {
		Invoice invoice = new Invoice(1, customer, 75000);

		assertEquals(35000, invoice.getAmountAfterDiscount(), 2);
	}
	
	@Test
	public void testGetAmount() {
		Invoice invoice = new Invoice(1, customer, 55000);
		
		assertEquals(55000, invoice.getAmount(), 2);
	}
	
	@Test
	public void testGetAmountAfterDiscount() {
		Invoice invoice = new Invoice(1, customer, 55000);
		assertEquals(55000, invoice.getAmount(), 2);
	
	}
	
}
