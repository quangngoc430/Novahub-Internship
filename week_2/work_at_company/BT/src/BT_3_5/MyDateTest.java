package BT_3_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyDateTest {
	
	@Test
	public void TestGetDayOfWeek() {
		MyDate myDate = new MyDate(2017, 11, 22);
	
		assertEquals(3, MyDate.getDayOfWeek(2017, 11, 22));
	}
}
