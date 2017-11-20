package BT_1_7;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		String output = "";
		
		if(day < 10) {
			output += "0" + day;
		}
		else {
			output += day;
		}
		
		output += "/";
		
		if(month < 10) {
			output += "0" + month;
		}
		else {
			output += month;
		}
		
		output += "/";
		
		output += year;
		
		return output;
	}
	
}
