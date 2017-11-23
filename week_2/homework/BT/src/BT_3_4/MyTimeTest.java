package BT_3_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTimeTest {
	
	@Test
	public void testDefaultConstructor() {
		MyTime myTime = new MyTime();
		myTime.setHour(13);
		myTime.setMinute(24);
		myTime.setSecond(54);
		
		assertEquals(13, myTime.getHour());
		assertEquals(24, myTime.getMinute());
		assertEquals(54, myTime.getSecond());
	}
	
	@Test
	public void testConstructor() {
		MyTime myTime;
		
		// invalid time
		myTime = new MyTime(24, 56, 59);
		
		assertEquals(-1, myTime.getHour());
		assertEquals(-1, myTime.getMinute());
		assertEquals(-1, myTime.getSecond());
		
		
		// valid time
		myTime = new MyTime(2, 34, 59);
		
		assertEquals(2, myTime.getHour());
		assertEquals(34, myTime.getMinute());
		assertEquals(59, myTime.getSecond());
	}
	
	@Test
	public void testSetTime() {
		MyTime myTime = new MyTime(2, 34, 59);
		
		// invalid time
		myTime.setTime(38, 60, 34);
		assertEquals(2, myTime.getHour());
		assertEquals(34, myTime.getMinute());
		assertEquals(59, myTime.getSecond());
		
		// valid time
		myTime.setTime(15, 37, 25);
		
		assertEquals(15, myTime.getHour());
		assertEquals(37, myTime.getMinute());
		assertEquals(25, myTime.getSecond());
	}
	
	@Test
	public void testSetHour() {
		MyTime myTime = new MyTime(2, 34, 59);
		
		// invalid hour
		// hour > 23
		myTime.setHour(25);
		
		assertEquals(2, myTime.getHour());

		// invalid hour
		// hour < 0
		myTime.setHour(-5);
		
		assertEquals(2, myTime.getHour());
		
		// valid hour
		myTime.setHour(14);
		
		assertEquals(14, myTime.getHour());
	}
	
	@Test
	public void testGetHour() {
		MyTime myTime = new MyTime(2, 34, 59);
		
		assertEquals(2, myTime.getHour());
	}
	
	@Test
	public void testSetMinute() {
		MyTime myTime = new MyTime(2, 34, 59);
		
		// invalid minute
		// minute > 59
		myTime.setMinute(74);
		
		assertEquals(34, myTime.getMinute());
		
		// invalid minute
		// minute < 0
		myTime.setMinute(-4);
		
		assertEquals(34, myTime.getMinute());
		
		// valid minute
		myTime.setMinute(35);
		
		assertEquals(35, myTime.getMinute());
	}
	
	@Test
	public void testGetMinute() {
		MyTime myTime = new MyTime(2, 34, 59);
		
		assertEquals(34, myTime.getMinute());
	}
	
	@Test
	public void testSetSecond() {
		MyTime myTime = new MyTime(2, 34, 59);
		
		// invalid second
		// second > 59
		myTime.setSecond(94);
		
		assertEquals(59, myTime.getSecond());
		
		// invalid second
		// second < 0
		myTime.setSecond(-6);
		
		assertEquals(59, myTime.getSecond());
		
		// valid second
		myTime.setSecond(27);
		
		assertEquals(27, myTime.getSecond());
	}
	
	@Test
	public void testGetSecond() {
		MyTime myTime = new MyTime(2, 34, 59);
		
		assertEquals(59, myTime.getSecond());
	}
	
	@Test
	public void testNextHour() {
		MyTime myTime = new MyTime();
		
		// hour < 23 
		myTime.setTime(1, 35, 47);
		
		assertEquals("02:35:47", myTime.nextHour().toString());
		
		// hour == 23
		myTime.setTime(23,  35, 47);
		assertEquals("00:35:47", myTime.nextHour().toString());
	}
	
	@Test
	public void testNextMinute() {
		MyTime myTime = new MyTime();
		
		// hour < 23 
		// minute < 59
		myTime.setTime(1, 35, 47);
		
		assertEquals("01:36:47", myTime.nextMinute().toString());
		
		// hour < 23 
		// minute == 59
		myTime.setTime(1, 59, 47);
		
		assertEquals("02:00:47", myTime.nextMinute().toString());
		
		// hour == 23
		// minute < 59
		myTime.setTime(23, 35, 47);
		assertEquals("23:36:47", myTime.nextMinute().toString());

		// hour == 23
		// minute == 59
		myTime.setTime(23, 59, 47);
		assertEquals("00:00:47", myTime.nextMinute().toString());
	}
	
	@Test
	public void testNextSecond() {
		MyTime myTime = new MyTime();
		
		// hour < 23 
		// minute < 59
		// second < 59
		myTime.setTime(1, 35, 58);
		
		assertEquals("01:35:59", myTime.nextSecond().toString());
		
		// hour < 23 
		// minute < 59
		// second == 59
		myTime.setTime(1, 37, 59);
		
		assertEquals("01:38:00", myTime.nextSecond().toString());

		// hour < 23 
		// minute == 59
		// second < 59
		myTime.setTime(1, 59, 49);
		
		assertEquals("01:59:50", myTime.nextSecond().toString());

		// hour < 23 
		// minute == 59
		// second == 59
		myTime.setTime(1, 59, 59);
		
		assertEquals("02:00:00", myTime.nextSecond().toString());

		// hour == 23 
		// minute < 59
		// second < 59
		myTime.setTime(23, 9, 29);
		
		assertEquals("23:09:30", myTime.nextSecond().toString());

		// hour == 23 
		// minute < 59
		// second == 59
		myTime.setTime(23, 9, 59);
		
		assertEquals("23:10:00", myTime.nextSecond().toString());

		// hour == 23 
		// minute == 59
		// second < 59
		myTime.setTime(23, 59, 29);
		
		assertEquals("23:59:30", myTime.nextSecond().toString());

		// hour == 23 
		// minute == 59
		// second == 59
		myTime.setTime(23, 59, 59);
		
		assertEquals("00:00:00", myTime.nextSecond().toString());
	}
	
	@Test
	public void testPreviousHour() {
		MyTime myTime = new MyTime();
		
		// hour > 0
		myTime.setTime(3, 49, 50);
		
		assertEquals("02:49:50", myTime.previousHour().toString());
		
		// hour == 0
		myTime.setTime(0, 49, 50);
		
		assertEquals("23:49:50", myTime.previousHour().toString());
	}
	
	@Test
	public void testPreviousMinute() {
		MyTime myTime = new MyTime();
		
		// hour > 0
		// minute > 0
		myTime.setTime(3, 49, 50);
		
		assertEquals("03:48:50", myTime.previousMinute().toString());
		
		// hour > 0
		// minute == 0
		myTime.setTime(3, 0, 50);
		
		assertEquals("02:59:50", myTime.previousMinute().toString());
		
		// hour == 0
		// minute > 0
		myTime.setTime(0, 49, 50);
				
		assertEquals("00:48:50", myTime.previousMinute().toString());

		// hour == 0
		// minute == 0
		myTime.setTime(0, 0, 50);
				
		assertEquals("23:59:50", myTime.previousMinute().toString());
	}
	
	@Test
	public void testPreviousSecond() {
		MyTime myTime = new MyTime();
		
		// hour > 0
		// minute > 0
		// second > 0
		
		myTime.setTime(3, 49, 50);
		
		assertEquals("03:49:49", myTime.previousSecond().toString());

		// hour > 0
		// minute > 0
		// second == 0
		
		myTime.setTime(3, 49, 0);
		
		assertEquals("03:48:59", myTime.previousSecond().toString());

		// hour > 0
		// minute == 0
		// second > 0
		
		myTime.setTime(3, 0, 50);
		
		assertEquals("03:00:49", myTime.previousSecond().toString());

		// hour > 0
		// minute == 0
		// second == 0
		
		myTime.setTime(3, 0, 0);
		
		assertEquals("02:59:59", myTime.previousSecond().toString());

		// hour == 0
		// minute > 0
		// second > 0
		
		myTime.setTime(0, 49, 50);
		
		assertEquals("00:49:49", myTime.previousSecond().toString());
		
		// hour == 0
		// minute > 0
		// second == 0
		
		myTime.setTime(0, 49, 0);
		
		assertEquals("00:48:59", myTime.previousSecond().toString());

		// hour == 0
		// minute == 0
		// second > 0
		
		myTime.setTime(0, 0, 50);
		
		assertEquals("00:00:49", myTime.previousSecond().toString());

		// hour == 0
		// minute == 0
		// second == 0
		
		myTime.setTime(0, 0, 0);
		
		assertEquals("23:59:59", myTime.previousSecond().toString());
		
	}
	
	@Test
	public void testToString() {
		MyTime myTime = new MyTime();
		
		// hour < 10
		// minute < 10
		// second < 10
				
		myTime.setTime(3, 5, 7);
				
		assertEquals("03:05:07", myTime.toString());

		// hour < 10
		// minute < 10
		// second == 10
				
		myTime.setTime(3, 5, 10);
				
		assertEquals("03:05:10", myTime.toString());

		// hour < 10
		// minute < 10
		// second > 10
				
		myTime.setTime(3, 5, 17);
				
		assertEquals("03:05:17", myTime.toString());

		// hour < 10
		// minute == 10
		// second < 10
				
		myTime.setTime(3, 10, 7);
				
		assertEquals("03:10:07", myTime.toString());

		// hour < 10
		// minute == 10
		// second == 10
				
		myTime.setTime(3, 10, 10);
				
		assertEquals("03:10:10", myTime.toString());

		// hour < 10
		// minute == 10
		// second > 10
				
		myTime.setTime(3, 10, 17);
				
		assertEquals("03:10:17", myTime.toString());

		// hour < 10
		// minute > 10
		// second < 10
				
		myTime.setTime(3, 15, 7);
				
		assertEquals("03:15:07", myTime.toString());

		// hour < 10
		// minute > 10
		// second == 10
				
		myTime.setTime(3, 15, 10);
				
		assertEquals("03:15:10", myTime.toString());

		// hour < 10
		// minute > 10
		// second > 10
				
		myTime.setTime(3, 15, 17);
				
		assertEquals("03:15:17", myTime.toString());

		// hour == 10
		// minute < 10
		// second < 10
				
		myTime.setTime(10, 5, 7);
				
		assertEquals("10:05:07", myTime.toString());

		// hour == 10
		// minute < 10
		// second == 10
				
		myTime.setTime(10, 5, 10);
				
		assertEquals("10:05:10", myTime.toString());

		// hour == 10
		// minute < 10
		// second > 10
				
		myTime.setTime(10, 5, 17);
				
		assertEquals("10:05:17", myTime.toString());

		// hour == 10
		// minute == 10
		// second < 10
				
		myTime.setTime(10, 10, 7);
				
		assertEquals("10:10:07", myTime.toString());

		// hour == 10
		// minute == 10
		// second == 10
				
		myTime.setTime(10, 10, 10);
				
		assertEquals("10:10:10", myTime.toString());

		// hour == 10
		// minute == 10
		// second > 10
				
		myTime.setTime(10, 10, 17);
				
		assertEquals("10:10:17", myTime.toString());
	}
}
