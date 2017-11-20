package BT_1_7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void TestDefaultDate() {
		Date date = new Date();
		date.setDay(1);
		date.setMonth(9);
		date.setYear(1997);
		
		assertEquals(1, date.getDay());
		assertEquals(9, date.getMonth());
		assertEquals(1997, date.getYear());
	}
	
	@Test
	public void TestConstructor() {
		Date date = new Date(1, 9, 1997);
		
		assertEquals(1, date.getDay());
		assertEquals(9, date.getMonth());
		assertEquals(1997, date.getYear());
	}
	
	@Test
	public void TestSetDay() {
		Date date = new Date();
		date.setDay(2);
		
		assertEquals(2, date.getDay());
	}
	
	@Test
	public void TestSetMonth() {
		Date date = new Date();
		date.setMonth(5);
		
		assertEquals(5, date.getMonth());
	}
	
	@Test
	public void TestSetYear() {
		Date date = new Date();
		date.setYear(1999);
		
		assertEquals(1999, date.getYear());
	}
	
	@Test
	public void TestSetDate() {
		Date date = new Date();
		date.setDate(2, 11, 1998);
		
		assertEquals (2, date.getDay());
		assertEquals (11, date.getMonth());
		assertEquals(1998, date.getYear());
	}
	
	@Test
	public void TestToString() {
		Date date = new Date();
		
		date.setDate(1, 9, 1997);
		// day < 10
		// month < 10		
		assertEquals("01/09/1997", date.toString());
		
		date.setDate(11, 9, 1997);
		// day > 10
		// month < 10
		assertEquals("11/09/1997", date.toString());
		

		date.setDate(11, 11, 1997);
		// day > 10
		// month > 10
		assertEquals("11/11/1997", date.toString());

		date.setDate(10, 10, 1997);
		// day == 10
		// month == 10
		assertEquals("10/10/1997", date.toString());
	}
}





