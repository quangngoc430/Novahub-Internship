package BT_3_5;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private final String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private final static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean isLeapYear(int year) {
		boolean output = false;
		
		if(year % 400 == 0 | (year % 4 == 0 && year % 100 != 0)) {
			output = true;
		}
		
		return output;
	}
	
	public static boolean isValidDate(int year, int month, int day) {
		boolean output = true;
		
		if(!(month >= 1 && month <= 12)) {
			output = false;
		}
		else {
			if(month == 2) {
				if(isLeapYear(year) == true) {
					if(day != 29)
						output = false;
				}
				else {
					if(day != 28)
						output = false;
				}
			}
			else {
				if(daysInMonths[month - 1] != day) {
					output = false;
					
				}
			}
		}
		
		if(!(year >= 1 && year <= 9999)) {
			output = false;
		}
		
		if(output == false) {
			System.out.println("Invalid year, month, or day!");
		}
		
		return output;
	}

	public static int getDayOfWeek(int year, int month, int day) {
		final int[] numberOfCenturies = {6, 4, 2, 0};
		final int[] numberOfMonthsNonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		final int[] numberOfMonthsLeapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		
		int dayOfWeek = 0;
		int numberOfCentury = numberOfCenturies[(year / 100) % 4];
		int numberOfMonth;
		
		if(isLeapYear(year) == true) {
			numberOfMonth = numberOfMonthsLeapYear[month - 1];
		}
		else {
			numberOfMonth = numberOfMonthsNonLeapYear[month - 1];
		}

		dayOfWeek = (numberOfCentury + (year % 100) + ((year % 100) / 4) + numberOfMonth + day) % 7;
		
		return dayOfWeek;
	}

	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	
}









