package BT_3_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyDateTest {
	
	
	@Test
	public void TestGetDayOfWeek() {
		MyDate myDate = new MyDate(2017, 11, 22);
	
		assertEquals(3, MyDate.getDayOfWeek(2017, 11, 22));
	}
	
	@Test
	public void TestNextDay() {
		MyDate myDate = new MyDate(2017, 2, 28);
		myDate = myDate.nextDay();
		assertEquals(1, myDate.getDay());
		assertEquals(3, myDate.getMonth());
	}
}
