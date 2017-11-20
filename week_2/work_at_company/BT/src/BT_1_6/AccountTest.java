package BT_1_6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	
	@Test
	public void TestDefaultConstructor() {
		Account account = new Account();
		account.setId("01");
		account.setName("account 01");
		account.setBalance(50000000);
		
		assertEquals("01", account.getId());
		assertEquals("account 01", account.getName());
		assertEquals(50000000, account.getBalance());
	}
	
	@Test
	public void TestConstructorWithTwoArguments() {
		Account account = new Account("02", "account 02");
		
		assertEquals("02", account.getId());
		assertEquals("account 02", account.getName());
	}
	
	@Test
	public void TestConstructorWithThreeArguments() {
		Account account = new Account("03", "account 03", 1000000000);
		
		assertEquals("03", account.getId());
		assertEquals("account 03", account.getName());
		assertEquals(1000000000, account.getBalance());
	}
	
	@Test
	public void TestSetId() {
		Account account = new Account();
		account.setId("05");
		
		assertEquals("05", account.getId());
	}
	
	@Test
	public void TestSetName() {
		Account account = new Account();
		account.setName("Ngoc Bui");
		
		assertEquals("Ngoc Bui", account.getName());
	}
	
	@Test
	public void TestSetBalance() {
		Account account = new Account();
		account.setBalance(250000000);
		
		assertEquals(250000000, account.getBalance());
	}
	
	@Test
	public void TestCredit() {
		Account account = new Account();
		account.setId("01");
		account.setName("Dieu Nhi");
		account.setBalance(50000);
		
		assertEquals(80000, account.credit(30000));
	}
	
	@Test
	public void TestDebit() {
		
		// case amount < balance
		Account account = new Account();
		account.setId("00");
		account.setName("Bui Ngoc");
		account.setBalance(50000);
		assertEquals(20000, account.debit(30000));
		
		// case amount == balance
		
		Account account1 = new Account();
		account1.setId("01");
		account1.setName("Account 01");
		account1.setBalance(50000);
		assertEquals(0, account1.debit(50000));
		
		// case amount > balance 
		
		Account account2 = new Account();
		account2.setId("02");
		account2.setName("Account 02");
		account2.setBalance(70000);
		assertEquals(70000, account2.debit(100000));
	}
	
	@Test
	public void TestTransferTo() {
		Account account = new Account();
		account.setId("0");
		account.setName("account");
		account.setBalance(50000);
		
		Account anotherAccount = new Account();
		anotherAccount.setId("1");
		anotherAccount.setName("another account");
		anotherAccount.setBalance(70000);
		
		// case amount < balance
		account.transfer(anotherAccount, 45000);
		assertEquals(5000, account.getBalance());
		assertEquals(115000, anotherAccount.getBalance());
		
		// case amount == balance
		account.setBalance(50000);
		anotherAccount.setBalance(70000);
		account.transfer(anotherAccount, 45000);
		assertEquals(5000, account.getBalance());
		assertEquals(115000, anotherAccount.getBalance());
		
		// case amount > balance
		account.setBalance(50000);
		anotherAccount.setBalance(70000);
		account.transfer(anotherAccount, 80000);
		assertEquals(50000, account.getBalance());
		assertEquals(70000, anotherAccount.getBalance());
	}
	
	@Test
	public void TestToString() {
		Account account = new Account();
		account.setId("0");
		account.setName("account 0");
		account.setBalance(50000);
		
		assertEquals("Account[id=0,name=account 0,balance=50000]", account.toString());
	}
}































