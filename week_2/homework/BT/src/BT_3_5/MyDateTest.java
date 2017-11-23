package BT_3_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyDateTest {
	
	@Test
	public void testIsLeapYear() {
		assertEquals(true, MyDate.isLeapYear(2016));
		assertEquals(true, MyDate.isLeapYear(2000));
		assertEquals(false, MyDate.isLeapYear(2017));
	}
	
	@Test
	public void testIsValidate() {
		
		// month < 1
		assertEquals(false, MyDate.isValidDate(2000, 0, 1));
		
		// month > 12
		assertEquals(false, MyDate.isValidDate(2000, 13, 1));
		
		// month == 2
		// isLeapYear == true
		// 1 <= day <= 29
		assertEquals(true, MyDate.isValidDate(2000, 2, 29));
		
		// month == 2
		// isLeapYear == true
		// day < 1 
		assertEquals(false, MyDate.isValidDate(2000, 2, 0));
		
		// month == 2
		// isLeapYear == true
		// day > 29 
		assertEquals(false, MyDate.isValidDate(2000, 2, 30));

		// month == 2
		// isLeapYear != true
		// 1 <= day <= 28
		assertEquals(true, MyDate.isValidDate(2001, 2, 28));
		
		// month == 2
		// isLeapYear != true
		// day < 1 
		assertEquals(false, MyDate.isValidDate(2010, 2, 0));
		
		// month == 2
		// isLeapYear != true
		// day > 28 
		assertEquals(false, MyDate.isValidDate(2011, 2, 30));
	
		// month != 2
		// day < daysInMonths[month - 1]
		assertEquals(true, MyDate.isValidDate(1997, 9, 19));
	
		// month != 2
		// day == daysInMonths[month -1]
		assertEquals(true, MyDate.isValidDate(1997, 9, 30));
	
		// month != 2
		// day > daysInMonths[month - 1]
		assertEquals(false, MyDate.isValidDate(1997, 9, 31));
	
		// year < 1
		assertEquals(false, MyDate.isValidDate(0, 1, 1));
		
		// year > 9999
		assertEquals(false, MyDate.isValidDate(10000, 1, 1));
	}
	
	@Test
	public void testGetDayOfWeek() {
		MyDate myDate = new MyDate(2017, 11, 22);
	
		// isLeapYear == false
		assertEquals(3, MyDate.getDayOfWeek(2017, 11, 22));
	
		// isLeapYear == true
		assertEquals(4, MyDate.getDayOfWeek(2016, 3, 17));
	}
	
	@Test
	public void testDefaultConstructor() {
		MyDate myDate = new MyDate();			
		myDate.setYear(2017);
		myDate.setMonth(11);
		myDate.setDay(24);
		
		assertEquals("Friday 24 Nov 2017", myDate.toString());
	}
	
	@Test
	public void testConstructor() {
		MyDate myDate = new MyDate(2017, 11, 25);
		
		assertEquals("Saturday 25 Nov 2017", myDate.toString());
	}
	
	@Test
	public void testSetDate() {
		MyDate myDate = new MyDate(2017, 11, 24);
		
		// invalid date
		myDate.setDate(2017, 11, 54);
		assertEquals("Friday 24 Nov 2017", myDate.toString());
		
		// valid date
		myDate.setDate(2017, 12, 31);
		assertEquals("Sunday 31 Dec 2017", myDate.toString());
	}

	@Test
	public void testGetYear() {
		MyDate myDate = new MyDate();
		myDate.setYear(2014);
		
		assertEquals(2014, myDate.getYear());
	}
	
	@Test
	public void testSetYear() {
		MyDate myDate = new MyDate(2017, 11, 24);
		
		// invalid year
		myDate.setYear(10000);
		assertEquals(2017, myDate.getYear());
		
		myDate.setYear(0);
		assertEquals(2017, myDate.getYear());
		
		// valid year
		myDate.setYear(2000);
		assertEquals(2000, myDate.getYear());
		
	}
	
	@Test
	public void testGetMonth() {
		MyDate myDate = new MyDate();
		myDate.setMonth(5);
		
		assertEquals(5, myDate.getMonth());
	}
	
	@Test
	public void testSetMonth() {
		MyDate myDate = new MyDate(2017, 11, 24);
		
		// invalid month
		myDate.setMonth(-1);
		assertEquals(11, myDate.getMonth());
		
		myDate.setMonth(14);
		assertEquals(11, myDate.getMonth());
		
		// valid month
		myDate.setMonth(8);
		assertEquals(8, myDate.getMonth());
	}
	
	@Test
	public void testGetDay() {
		MyDate myDate = new MyDate();
		myDate.setYear(2012);
		myDate.setMonth(2);
		myDate.setDay(29);	
		
		assertEquals("Wednesday 29 Feb 2012", myDate.toString());
	}
	
	@Test
	public void testSetDay() {
		MyDate myDate = new MyDate(2017, 11, 24);
		
		// invalid day
		myDate.setDay(31);
		assertEquals(24, myDate.getDay());
		
		// valid day
		myDate.setDay(17);
		assertEquals(17, myDate.getDay());
	}
	
	@Test
	public void testNextDay() {
		MyDate myDate = new MyDate();
		
		// month == 2
		// isLeapYear == true
		// day < 29
		myDate.setYear(2016);
		myDate.setMonth(2);
		myDate.setDay(17);
		
		myDate = myDate.nextDay();
		assertEquals(18, myDate.getDay());
		assertEquals(2, myDate.getMonth());

		// month == 2
		// isLeapYear == true
		// day == 29
		myDate.setYear(2016);
		myDate.setMonth(2);
		myDate.setDay(29);
		
		myDate = myDate.nextDay();
		assertEquals(1, myDate.getDay());
		assertEquals(3, myDate.getMonth());

		// month == 2
		// isLeapYear == false
		// day < 28
		myDate.setYear(2017);
		myDate.setMonth(2);
		myDate.setDay(17);
		
		myDate = myDate.nextDay();
		assertEquals(18, myDate.getDay());
		assertEquals(2, myDate.getMonth());

		// month == 2
		// isLeapYear == false
		// day == 28
		myDate.setYear(2017);
		myDate.setMonth(2);
		myDate.setDay(28);
		
		myDate = myDate.nextDay();
		assertEquals(1, myDate.getDay());
		assertEquals(3, myDate.getMonth());
		
		// month != 2
		// day < default MAX day of month
		myDate.setYear(2017);
		myDate.setMonth(5);
		myDate.setDay(21);
		
		myDate = myDate.nextDay();
		assertEquals(22, myDate.getDay());
		assertEquals(5, myDate.getMonth());
		
		// month != 2
		// month != 12
		// day == default MAX day of month
		myDate.setYear(2017);
		myDate.setMonth(5);
		myDate.setDay(31);
		
		myDate = myDate.nextDay();
		assertEquals(1, myDate.getDay());
		assertEquals(6, myDate.getMonth());
		

		// month != 2
		// month == 12
		// day == default MAX day of month
		myDate.setYear(2017);
		myDate.setMonth(12);
		myDate.setDay(31);
		
		myDate = myDate.nextDay();
		assertEquals(1, myDate.getDay());
		assertEquals(1, myDate.getMonth());
		assertEquals(2018, myDate.getYear());
		
	}

	@Test
	public void testNextMonth() {
		MyDate myDate = new MyDate();
		
		// month < 12
		// isLeapYear == true
		// month == 2
		// day == 29
		
		myDate.setYear(2012);
		myDate.setMonth(2);
		myDate.setDay(29);
		
		myDate = myDate.nextMonth();
		
		assertEquals(3, myDate.getMonth());
		assertEquals(31, myDate.getDay());
				
		// month < 12
		// isLeapYear == true
		// month == 2
		// day == 17
		
		myDate.setYear(2012);
		myDate.setMonth(2);
		myDate.setDay(17);
		
		myDate = myDate.nextMonth();
		
		assertEquals(3, myDate.getMonth());
		assertEquals(17, myDate.getDay());
		
		// month < 12
		// isLeapYear != true
		// month == 5 
		// day == 31 (day == MAX day of month)
		
		myDate.setYear(2013);
		myDate.setMonth(5);
		myDate.setDay(31);
		
		myDate = myDate.nextMonth();
		
		assertEquals(6, myDate.getMonth());
		assertEquals(30, myDate.getDay());

		// month < 12
		// isLeapYear != true
		// day == 19
		
		myDate.setYear(2013);
		myDate.setMonth(3);
		myDate.setDay(19);
		
		myDate = myDate.nextMonth();
		
		assertEquals(4, myDate.getMonth());
		assertEquals(19, myDate.getDay());
		

		// month == 12
		
		myDate.setYear(2013);
		myDate.setMonth(12);
		myDate.setDay(13);
		
		myDate = myDate.nextMonth();
		
		assertEquals(2014, myDate.getYear());
		assertEquals(1, myDate.getMonth());
		assertEquals(13, myDate.getDay());
	}

	@Test
	public void testNextYear() {
		MyDate myDate = new MyDate();
		
		// year + 1 > 9999
		myDate.setYear(9999);
		myDate = myDate.nextYear();
		
		assertEquals(9999, myDate.getYear());
		
		// year + 1 <= 9999
		// isLeapYear == true
		// month = 2
		// day = 29
		myDate.setYear(2012);
		myDate.setMonth(2);
		myDate.setDay(29);
		
		myDate = myDate.nextYear();
		assertEquals(28, myDate.getDay());
		assertEquals(2, myDate.getMonth());
		assertEquals(2013, myDate.getYear());

		// year + 1 <= 9999
		// isLeapYear == true
		// month = 3
		// day = 13
		myDate.setYear(2012);
		myDate.setMonth(3);
		myDate.setDay(13);
		
		myDate = myDate.nextYear();
		assertEquals(13, myDate.getDay());
		assertEquals(3, myDate.getMonth());
		assertEquals(2013, myDate.getYear());
		
		// year + 1 <= 9999
		// year == 2014
		// isLeapYear == false
		// month = 2
		// day = 28
		myDate.setYear(2014);
		myDate.setMonth(2);
		myDate.setDay(28);
		
		myDate = myDate.nextYear();
		assertEquals(28, myDate.getDay());
		assertEquals(2, myDate.getMonth());
		assertEquals(2015, myDate.getYear());

		// year + 1 <= 9999
		// year == 2015
		// isLeapYear == false
		// month = 2
		// day = 28
		myDate.setYear(2015);
		myDate.setMonth(2);
		myDate.setDay(28);
		
		myDate = myDate.nextYear();
		assertEquals(29, myDate.getDay());
		assertEquals(2, myDate.getMonth());
		assertEquals(2016, myDate.getYear());
		
		// year + 1 <= 9999
		// year == 2014
		// isLeapYear == false
		// month = 4
		// day = 27
		myDate.setYear(2014);
		myDate.setMonth(4);
		myDate.setDay(27);
		
		myDate = myDate.nextYear();
		assertEquals(27, myDate.getDay());
		assertEquals(4, myDate.getMonth());
		assertEquals(2015, myDate.getYear());
	}

	@Test
	public void testPreviousDay() {
		MyDate myDate = new MyDate();
		
		// month == 3
		// isLeapYear == true
		// day == 1
		myDate.setYear(2012);
		myDate.setMonth(3);
		myDate.setDay(1);
		
		myDate = myDate.previousDay();
		assertEquals(29, myDate.getDay());
		assertEquals(2, myDate.getMonth());
		assertEquals(2012, myDate.getYear());
		
		// month == 3
		// isLeapYear == true
		// day != 1
		myDate.setYear(2012);
		myDate.setMonth(3);
		myDate.setDay(13);
		
		myDate = myDate.previousDay();
		assertEquals(12, myDate.getDay());
		assertEquals(3, myDate.getMonth());
		assertEquals(2012, myDate.getYear());

		// month == 3
		// isLeapYear != true
		// day == 1
		myDate.setYear(2013);
		myDate.setMonth(3);
		myDate.setDay(1);
		
		myDate = myDate.previousDay();
		assertEquals(28, myDate.getDay());
		assertEquals(2, myDate.getMonth());
		assertEquals(2013, myDate.getYear());

		// month == 3
		// isLeapYear != true
		// day != 1
		myDate.setYear(2013);
		myDate.setMonth(3);
		myDate.setDay(15);
		
		myDate = myDate.previousDay();
		assertEquals(14, myDate.getDay());
		assertEquals(3, myDate.getMonth());
		assertEquals(2013, myDate.getYear());
		
		
		// month != 3
		// day == 1
		// month == 1
		myDate.setYear(2012);
		myDate.setMonth(1);
		myDate.setDay(1);
		
		myDate = myDate.previousDay();
		assertEquals(31, myDate.getDay());
		assertEquals(12, myDate.getMonth());
		assertEquals(2011, myDate.getYear());

		// month != 3
		// day == 1
		// month != 1
		myDate.setYear(2012);
		myDate.setMonth(5);
		myDate.setDay(1);
		
		myDate = myDate.previousDay();
		assertEquals(30, myDate.getDay());
		assertEquals(4, myDate.getMonth());
		assertEquals(2012, myDate.getYear());

		// month != 3
		// day != 1
		myDate.setYear(2012);
		myDate.setMonth(5);
		myDate.setDay(18);
		
		myDate = myDate.previousDay();
		assertEquals(17, myDate.getDay());
		assertEquals(5, myDate.getMonth());
		assertEquals(2012, myDate.getYear());
		
	}

	@Test
	public void testPreviousMonth() {
		MyDate myDate = new MyDate();
		
		// month > 1
		// isLeapYear == true
		// month == 2 && day == 29
		myDate.setYear(2040);
		myDate.setMonth(2);
		myDate.setDay(29);
		myDate = myDate.previousMonth();
		
		assertEquals(31, myDate.getDay());
		assertEquals(1, myDate.getMonth());
		
		// month > 1
		// isLeapYear == false
		myDate.setYear(2013);
		myDate.setMonth(4);
		myDate.setDay(30);
		myDate = myDate.previousMonth();
		
		assertEquals(31, myDate.getDay());
		assertEquals(3, myDate.getMonth());
		
		
		// month == 1
		myDate.setYear(2013);
		myDate.setMonth(1);
		myDate.setDay(13);
		myDate = myDate.previousMonth();
		
		assertEquals(13, myDate.getDay());
		assertEquals(12, myDate.getMonth());
		assertEquals(2012, myDate.getYear());
	}

	@Test
	public void testPreviousYear() {
		MyDate myDate = new MyDate();
		
		// year <= 1
		
		myDate.setDate(1, 12, 13);
		myDate = myDate.previousYear();
		
		assertEquals(1, myDate.getYear());
		assertEquals(12, myDate.getMonth());
		assertEquals(13, myDate.getDay());
		
		// year > 1
		// isLeapYear == true
		// month == 2
		// day == 29

		myDate.setDate(2012, 2, 29);
		myDate = myDate.previousYear();
		
		assertEquals(2011, myDate.getYear());
		assertEquals(2, myDate.getMonth());
		assertEquals(28, myDate.getDay());

		// year > 1
		// isLeapYear != true
		// month == 2
		// day == 28
		// isLeapYear(year - 1) == true

		myDate.setDate(2017, 2, 28);
		myDate = myDate.previousYear();
		
		assertEquals(2016, myDate.getYear());
		assertEquals(2, myDate.getMonth());
		assertEquals(29, myDate.getDay());
	}
}






