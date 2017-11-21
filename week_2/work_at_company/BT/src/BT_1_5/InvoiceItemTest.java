package BT_1_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceItemTest {
	
	@Test
	public void testDefaultConstructor() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setId("001");
		invoiceItem.setDesc("description of invoice 001");
		invoiceItem.setQty(100);
		invoiceItem.setUnitPrice(3000);
		
		assertEquals("001", invoiceItem.getId());
		assertEquals("description of invoice 001", invoiceItem.getDesc());
		assertEquals(100, invoiceItem.getQty());
		assertEquals(3000.00, invoiceItem.getUnitPrice(), 2);
	}
	
	@Test
	public void testConstructor() {
		InvoiceItem invoiceItem = new InvoiceItem( "002", "description of invoice 002", 200, 4000);
		
		assertEquals("002", invoiceItem.getId());
		assertEquals("description of invoice 002", invoiceItem.getDesc());
		assertEquals(200, invoiceItem.getQty());
		assertEquals(4000.00, invoiceItem.getUnitPrice(), 2);
	}
	
	@Test
	public void testSetId() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setId("003");
		
		assertEquals("003", invoiceItem.getId());
	}
	
	@Test
	public void testGetId() {
		InvoiceItem invoiceItem = new InvoiceItem("1", "description of invoice 1", 100, 4000000);
		
		assertEquals("1", invoiceItem.getId());
	}

	@Test
	public void testSetDesc() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setDesc("description of invoice");
		
		assertEquals("description of invoice", invoiceItem.getDesc());
	}
	
	@Test
	public void testGetDesc() {
		InvoiceItem invoiceItem = new InvoiceItem("2", "electricity", 500, 40000);
		
		assertEquals("electricity", invoiceItem.getDesc());		
	}
	
	@Test
	public void testSetQty() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setQty(250);
		
		assertEquals(250,invoiceItem.getQty());
	}
	
	@Test
	public void testGetQty() {
		InvoiceItem invoiceItem = new InvoiceItem("3", "water bill", 600, 2000);
		
		assertEquals(600, invoiceItem.getQty());
	}
	
	@Test
	public void testSetUnitPrice() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setUnitPrice(3000);
		
		assertEquals(3000.00, invoiceItem.getUnitPrice(), 2);
	}
	
	@Test
	public void testGetUnitPrice() {
		InvoiceItem invoiceItem = new InvoiceItem("4", "water and electricity bills", 500, 4000);
		
		assertEquals(4000.00, invoiceItem.getUnitPrice(), 2);
	}
	
	@Test
	public void testGetTotal() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setQty(100);
		invoiceItem.setUnitPrice(2000.00);
		
		assertEquals(200000.00, invoiceItem.getTotal(), 2);
	}
	
	@Test
	public void testToString() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setId("004");
		invoiceItem.setDesc("Description of invoice 004");
		invoiceItem.setQty(40);
		invoiceItem.setUnitPrice(2500.50);
		
		assertEquals("InvoiceItem[id=" + invoiceItem.getId() 
		+ ",desc=" + invoiceItem.getDesc() 
		+ ",qty=" + invoiceItem.getQty() 
		+ ",unitPrice=" + invoiceItem.getUnitPrice() + "]",
		invoiceItem.toString());
	}
}









