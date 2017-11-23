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

	public boolean validateDate(int year, int month, int day) {
		boolean output = true;
		
		if(!(year >= 1 && year <= 9999)) {
			output = false;
		}
		
		if(!(month >= 1 && month <= 12)) {
			output = false;
		}
		else {
			if(month == 2) {
				if(isLeapYear(year) == true) {
					if(day > 29) {
						output = false;
					}
				}
				else {
					if(day > 28) {
						output = false;
					}
				}
			}
			else {
				if(day > daysInMonths[month - 1]) {
					output = false;
				}
			}
		}
		
		return output;		
	}
	
	public MyDate(int year, int month, int day) {
		super();
		setDate(year, month, day);
	}

	public void setDate(int year, int month, int day) {
		if(validateDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
		else {
			System.out.println("Invalid year, month or day!");
		}
	}

	public int getYear() {
		return year;
	}

	private boolean checkYear(int year) {
		boolean output = true;
		
		if(!(year >= 1 && year <= 9999))
			output = false;
			
		return output;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	private boolean checkMonth(int month) {
		boolean output = true;
		
		if(!(month >= 1 && month <= 12))
			output = false;
		
		return output;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	private boolean checkDay(int day, int month) {
		boolean output = true;
		
		if(!(month >= 1 && month <= 12)) {
			output = false;
		}
		else {
			if(month == 2) {
				if(day != 29) {
					output = false;
				}
			}
			else {
				if(daysInMonths[month - 1] != day) {
					output = false;
				}
			}
		}
		
		return output;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		String output = "";
		
		output += strDays[getDayOfWeek(year, month, day)] + " ";
		output += day + " ";
		output += strMonths[month - 1] + " ";
		output += year;
		
		return output;
	}
	
	public MyDate nextDay() {
		
		if(month == 2) {
			if(isLeapYear(year) == true) {
				if(day < 29) {
					day++;
				}
				else {
					day = 1;
					month = 3;
				}
			}
			else {
				if(day < 28) {
					day++;
				}
				else {
					day = 1;
					month = 3;
				}
			}
		}
		else {
			if(day < daysInMonths[month - 1]) {
				day++;
			}
			else {
				day = 1;
				
				if(month == 12) {
					month = 1;
					nextYear();
				}
				else {
					month++;
				}
			}
		}
		
		return this;
	}
	
	public MyDate nextMonth() {
		if(month < 12) {
			
			if(isLeapYear(year) == true) {
				if(month == 2 && day == 29) {
					day = 31;
				}
			}
			else {
				if(day == daysInMonths[month - 1]) {
					day = daysInMonths[month];
				}
			}
			
			month++;
		}
		else {
			month = 1;
			nextYear();
		}
		
		return this;
	}
	
	public MyDate nextYear() {
		
		if(year + 1 > 9999) {
			System.out.println("Year out of range!");
		}
		else {
			year++;
			
			if(isLeapYear(year) == true) {
				if(month == 2 && day == 28) {
					day = 29;
				}
			}
			else {
				if(month == 2 && day == 29) {
					day = 28;
				}
			}
		}
		
		return this;
	}
	
	public MyDate previousDay() {
		
		if(month == 3) {
			if(isLeapYear(year) == true) {
				if(day == 1) {
					day = 29;
					month = 2;
				}
				else {
					day--;
				}
			}
			else {
				if(day == 1) {
					day = 28;
					month = 2;
				}
				else {
					day--;
				}
			}
		}
		else {
			if(day == 1) {
				if(month == 1) {
					day = 31;
					month = 12;
					previousYear();
				}
				else {
					day = daysInMonths[month - 2];
				}
			}
			else {
				day--;
			}
		}
		
		return this;
	}
	
	public MyDate previousMonth() {
		if(month > 1) {
			
			if(isLeapYear(year) == true) {
				if(month == 2 && day == 29) {
					day = 31;
				}
			}
			else {
				if(day == daysInMonths[month - 1]) {
					day = daysInMonths[month - 2];
				}
			}
			
			month--;
		}
		else {
			month = 12;
			previousYear();
		}

		return this;
	}
	
	public MyDate previousYear() {
		if(year - 1 < 1) {
			System.out.println("Year out of range!");
		}
		else {
			year--;
			
			if(isLeapYear(year) == true) {
				if(month == 2 && day == 28) {
					day = 29;
				}
			}
			else {
				if(month == 2 && day == 29) {
					day = 28;
				}
			}
		}
		
		return this;
	}
	
}









