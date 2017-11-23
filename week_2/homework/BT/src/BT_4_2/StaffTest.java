package BT_4_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StaffTest {
	
	@Test
	public void testDefaultConstructor() {
		Staff staff = new Staff();
		staff.setPay(100000);
		staff.setSchool("VNUK");
		
		assertEquals(100000, staff.getPay(), 2);
		assertEquals("VNUK", staff.getSchool());
	}
	
	@Test
	public void testConstructor() {
		Staff staff = new Staff("Ngoc", "Da Nang", "VNUK", 1550.68);
		
		assertEquals("Ngoc", staff.getName());
		assertEquals("Da Nang", staff.getAddress());
		assertEquals("VNUK", staff.getSchool());
		assertEquals(1550.68, staff.getPay(), 2);
	}
	
	@Test
	public void testSetPay() {
		Staff staff = new Staff();
		staff.setPay(1550.75);
		
		assertEquals(1550.75, staff.getPay(), 2);
	}
	
	@Test
	public void testGetPay() {
		Staff staff = new Staff("Ngoc", "Da Nang", "VNUK", 1550.68);
		
		assertEquals(1550.68, staff.getPay(), 2);
	}
	
	@Test
	public void testSetSchool() {
		Staff staff = new Staff();
		staff.setSchool("LQD");
		
		assertEquals("LQD", staff.getSchool());
	}
	
	@Test
	public void testGetSchool() {
		Staff staff = new Staff("Ngoc", "Da Nang", "VNUK", 1550.68);
		
		assertEquals("VNUK", staff.getSchool());
	}
	
	@Test
	public void testToString() {
		Staff staff = new Staff("Ngoc", "Da Nang", "VNUK", 1550.68);
		
		assertEquals("Staff[Person[name=Ngoc,address=Da Nang],school=VNUK,pay=1550.68]", staff.toString());
	}
}











