package BT_1_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceItemTest {
	
	@Test
	public void TestDefaultConstructor() {
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
	public void TestConstructor() {
		InvoiceItem invoiceItem = new InvoiceItem( "002", "description of invoice 002", 200, 4000);
		
		assertEquals("002", invoiceItem.getId());
		assertEquals("description of invoice 002", invoiceItem.getDesc());
		assertEquals(200, invoiceItem.getQty());
		assertEquals(4000.00, invoiceItem.getUnitPrice(), 2);
	}
	
	@Test
	public void TestSetId() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setId("003");
		
		assertEquals("003", invoiceItem.getId());
	}

	@Test
	public void TestSetDesc() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setDesc("description of invoice");
		
		assertEquals("description of invoice", invoiceItem.getDesc());
	}
	
	@Test
	public void TestSetQty() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setQty(250);
		
		assertEquals(250,invoiceItem.getQty());
	}
	
	@Test
	public void TestSetUnitPrice() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setUnitPrice(3000);
		
		assertEquals(3000.00, invoiceItem.getUnitPrice(), 2);
	}
	
	@Test
	public void TestGetTotal() {
		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setQty(100);
		invoiceItem.setUnitPrice(2000.00);
		
		assertEquals(200000.00, invoiceItem.getTotal(), 2);
	}
	
	@Test
	public void TestToString() {
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









