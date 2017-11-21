package BT_2_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	
	Customer customer = new Customer(13, "Ngoc", 'm');
	
	@Test
	public void testDefaultConstructor() {
		Account account = new Account();
		account.setID(1);
		account.setCustomer(customer);
		account.setBalance(130000.57);
		
		assertEquals(1, account.getID());
		assertEquals("Ngoc(13)", account.getCustomer().toString());
		assertEquals(130000.57, account.getBalance(), 2);
	}
	
	@Test
	public void testDefaultConstructorWithTwoArguments() {
		Account account = new Account(47, customer);
		
		assertEquals(47, account.getID());
		assertEquals("Ngoc(13)", account.getCustomer().toString());
	}
	
	@Test
	public void testDefaultConstructorWithThreeArguments() {
		Account account = new Account(50, customer, 1450.89);
		
		assertEquals(50, account.getID());
		assertEquals("Ngoc(13)", account.getCustomer().toString());
		assertEquals(1450.89, account.getBalance(), 2);
	}
	
	@Test
	public void testSetID() {
		Account account = new Account();
		account.setID(3000);
		
		assertEquals(3000, account.getID());
	}
	
	@Test
	public void testGetID() {
		Account account = new Account(23, customer, 350000);
		
		assertEquals(23, account.getID());
	}
	
	@Test
	public void testSetCustomer() {
		Account account = new Account();
		account.setCustomer(customer);
		
		assertEquals("Ngoc(13)", account.getCustomer().toString());
	}
	
	@Test
	public void testGetCustomer() {
		Account account = new Account(51, customer, 8900000);
		
		assertEquals("Ngoc(13)", account.getCustomer().toString());
	}
	
	@Test
	public void testSetBalance() {
		Account account = new Account();
		account.setBalance(135500);
		
		assertEquals(135500, account.getBalance(), 2);
	}
	
	@Test
	public void testGetBalance() {
		Account account = new Account(45, customer, 45000);
		
		assertEquals(45000, account.getBalance(), 2);
	}
	
	@Test
	public void testGetCustomerName() {
		Account account = new Account();
		account.setCustomer(customer);
		
		assertEquals("Ngoc", account.getCustomerName());
	}
	
	@Test
	public void testDeposit() {
		Account account = new Account(97, customer, 500000);
		
		assertEquals(600000, account.deposit(100000).getBalance(), 2);
	}
	
	@Test
	public void testWithDraw() {
		Account account = new Account();
		account.setBalance(400000);
		
		// amount > balance
		assertEquals(400000, account.withdraw(500000).getBalance(), 2);
		
		// amount == balance
		account.setBalance(400000);
		assertEquals(0, account.withdraw(400000).getBalance(), 2);
		
		// amount < balance
		account.setBalance(400000);
		assertEquals(100000, account.withdraw(300000).getBalance(), 2);
	}
	
	@Test
	public void testToString() {
		Account account = new Account(45, customer, 45000.435);
		
		assertEquals("Ngoc(13) balance=$45000.43", account.toString());
	}
	
}






