package BT_1_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeTest {
	
	@Test
	public void TestDefaultConstructor() {
		Time time = new Time();
		time.setSecond(30);
		time.setMinute(17);
		time.setHour(1);
		
		assertEquals(30, time.getSecond());
		assertEquals(17, time.getMinute());
		assertEquals(1, time.getHour());
	}
	
	@Test
	public void TestConstructor() {
		Time time = new Time(23, 26, 13);
		
		assertEquals(13, time.getSecond());
		assertEquals(26, time.getMinute());
		assertEquals(23, time.getHour());
	}
	
	@Test
	public void TestSetSecond() {
		Time time = new Time();
		time.setSecond(15);
		
		assertEquals(15, time.getSecond());
	}
	
	@Test
	public void TestSetMinute() {
		Time time = new Time();
		time.setMinute(5);
		
		assertEquals(5, time.getMinute());
	}
	
	@Test
	public void TestSetHour() {
		Time time = new Time();
		time.setHour(7);
		
		assertEquals(7, time.getHour());
	}
	
	@Test
	public void TestSetTime() {
		Time time = new Time();
		time.setTime(21, 20, 19);
		
		assertEquals(19, time.getSecond());
		assertEquals(20, time.getMinute());
		assertEquals(21, time.getHour());
	}
	
	@Test
	public void TestNextSecond() {
		Time newTime;
		Time time = new Time();
		
		// second < 59
		// minute < 59
		// hour < 23
		time.setSecond(58);
		time.setMinute(23);
		time.setHour(19);
		newTime = time.nextSecond();
		
		assertEquals(59, newTime.getSecond());
		assertEquals(23, newTime.getMinute());
		assertEquals(19, newTime.getHour());
		
		// second == 59 
		// minute <  59
		// hour < 23
		
		time.setSecond(59);
		time.setMinute(23);
		time.setHour(19);
		newTime = time.nextSecond();
		
		assertEquals(0, newTime.getSecond());
		assertEquals(24, newTime.getMinute());
		assertEquals(19, newTime.getHour());
		
		// second == 59 
		// minute == 59
		// hour < 23
				
		time.setSecond(59);
		time.setMinute(59);
		time.setHour(19);
		newTime = time.nextSecond();
				
		assertEquals(0, newTime.getSecond());
		assertEquals(0, newTime.getMinute());
		assertEquals(20, newTime.getHour());
		
		// second == 59 
		// minute == 59
		// hour == 23
		
		time.setSecond(59);
		time.setMinute(59);
		time.setHour(23);
		newTime = time.nextSecond();
				
		assertEquals(0, newTime.getSecond());
		assertEquals(0, newTime.getMinute());
		assertEquals(0, newTime.getHour());
	}
	
	@Test
	public void TestPreviousSecond() {
		Time newTime;
		Time time = new Time();
		
		// second > 0
		// minute > 0
		// hour > 0
		time.setSecond(12);
		time.setMinute(13);
		time.setHour(14);
		newTime = time.previousSecond();
		
		assertEquals(11, newTime.getSecond());
		assertEquals(13, newTime.getMinute());
		assertEquals(14, newTime.getHour());
		
		// second == 0 
		// minute > 0
		// hour > 0
		
		time.setSecond(0);
		time.setMinute(23);
		time.setHour(19);
		newTime = time.previousSecond();
		
		assertEquals(59, newTime.getSecond());
		assertEquals(22, newTime.getMinute());
		assertEquals(19, newTime.getHour());
		
		// second == 0 
		// minute == 0
		// hour > 0
				
		time.setSecond(0);
		time.setMinute(0);
		time.setHour(19);
		newTime = time.previousSecond();
				
		assertEquals(59, newTime.getSecond());
		assertEquals(59, newTime.getMinute());
		assertEquals(18, newTime.getHour());
		
		// second == 0 
		// minute == 0
		// hour == 0
		
		time.setSecond(0);
		time.setMinute(0);
		time.setHour(0);
		newTime = time.previousSecond();
				
		assertEquals(59, newTime.getSecond());
		assertEquals(59, newTime.getMinute());
		assertEquals(23, newTime.getHour());
	}
	
	@Test
	public void TestToString() {
		Time time = new Time();
		
		// hour < 10
		// minute < 10
		// second < 10 	
		
		time.setHour(5);		
		time.setMinute(7);
		time.setSecond(9);
		
		assertEquals("05:07:09", time.toString());
		
		// hour < 10
		// minute < 10
		// second > 10 	
		
		time.setHour(5);		
		time.setMinute(7);
		time.setSecond(19);
		
		assertEquals("05:07:19", time.toString());
		
		// hour < 10
		// minute > 10
		// second < 10 	
		
		time.setHour(5);		
		time.setMinute(27);
		time.setSecond(9);
		
		assertEquals("05:27:09", time.toString());
		
		// hour < 10
		// minute > 10
		// second > 10 	
		
		time.setHour(5);		
		time.setMinute(27);
		time.setSecond(59);
		
		assertEquals("05:27:59", time.toString());
			
		// hour > 10
		// minute < 10
		// second < 10 	
		
		time.setHour(15);		
		time.setMinute(6);
		time.setSecond(9);
		
		assertEquals("15:06:09", time.toString());
		
		// hour > 10
		// minute < 10
		// second > 10 	
		
		time.setHour(15);		
		time.setMinute(6);
		time.setSecond(36);
		
		assertEquals("15:06:36", time.toString());

		// hour > 10
		// minute > 10
		// second < 10 	
		
		time.setHour(15);		
		time.setMinute(47);
		time.setSecond(2);
		
		assertEquals("15:47:02", time.toString());

		// hour > 10
		// minute > 10
		// second > 10 	
		
		time.setHour(15);		
		time.setMinute(47);
		time.setSecond(32);
		
		assertEquals("15:47:32", time.toString());

		// hour == 10
		// minute == 10
		// second == 10 	
		
		time.setHour(10);		
		time.setMinute(10);
		time.setSecond(10);
		
		assertEquals("10:10:10", time.toString());
		
	}
}





