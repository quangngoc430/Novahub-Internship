package BT_3_4;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	public MyTime() {
		super();
	}
	
	private boolean validateInput(int hour, int minute, int second) {
		boolean output = true;
		
		if(!((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59))) {
			output = false;
		}
		
		return output;
	}	
	
	public MyTime(int hour, int minute, int second) {
		super();
		
		if(validateInput(hour, minute, second) == true) {			
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		else {
			System.out.println("Invalid hour, minute, or second!");
			this.hour = -1;
			this.minute = -1;
			this.second = -1;
		}
		
	}
	
	public void setTime(int hour, int minute, int second){
		
		if(validateInput(hour, minute, second) == true) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		else {
			System.out.println("Invalid hour, minute, or second!");
		}
	}

	public int getHour() {
		return hour;
	}
	
	private boolean validateHour(int hour) {
		boolean output = true;
		
		if(hour < 0 | hour > 23)
			output = false;
		
		return output;
	}
	
	public void setHour(int hour) {
		if(validateHour(hour) == true)
			this.hour = hour;
		else
			System.out.println("Invalid hour!");
	}
	
	public int getMinute() {
		return minute;
	}
	
	private boolean validateMinute(int minute) {
		boolean output = true;
		
		if(minute < 0 | minute > 59)
			output = false;
		
		return output;
	}

	public void setMinute(int minute) {
		if(validateMinute(minute) == true)
			this.minute = minute;
		else
			System.out.println("Invalid minute!");
	}
	
	public int getSecond() {
		return second;
	}
	
	private boolean validateSecond(int second) {
		boolean output = true;
		
		if(second < 0 | second > 59)
			output = false;
		
		return output;
	}

	public void setSecond(int second) {
		if(validateSecond(second) == true)
			this.second = second;
		else
			System.out.println("Invalid second!");
	}
	
	@Override
	public String toString() {
		String output = "";
		
		if(hour < 10) {
			output += "0";
		}
		
		output += hour + ":";
		
		if(minute < 10) {
			output += "0";
		}
		
		output += minute + ":";
		
		if(second < 10) {
			output += "0";
		}
		
		output += second;
		
		return output;
	}
	
	public MyTime nextSecond() {
		boolean checkAddMinute = false;
		boolean checkAddHour = false;
		
		if(second == 59) {
			second = 0;
			checkAddMinute = true;
		}
		else {
			second ++;
		}
		
		if(checkAddMinute == true) {
			if(minute == 59) {
				minute = 0;
				checkAddHour = true;
			}
			else {
				minute++;
			}			
		}
		
		if(checkAddHour == true) {
			if(hour == 23) {
				hour = 0;
			}
			else {
				hour++;
			}
		}
		
		return this;
	}
	
	public MyTime nextMinute() {
		boolean checkAddHour = false;
		
		if(minute == 59) {
			minute = 0;
			checkAddHour = true;
		}
		else {
			minute++;
		}			
		if(checkAddHour == true) {
			if(hour == 23) {
				hour = 0;
			}
			else {
				hour++;
			}
		}
		
		return this;
	}
	
	public MyTime nextHour() {
		
		if(hour == 23) {
			hour = 0;
		}
		else {
			hour++;
		}
		
		return this;
	}
	
	public MyTime previousSecond() {
		
		boolean checkSubtractMinute = false;
		boolean checkSubtractHour = false;
		
		if(second == 0) {
			second = 59;
			checkSubtractMinute = true;
		}
		else {
			second--;
		}
		
		if(checkSubtractMinute == true) {
			if(minute == 0) {
				minute = 59;
				checkSubtractHour = true;
			}
			else {
				minute--;
			}
		}
		
		if(checkSubtractHour == true) {
			if(hour == 0) {
				hour = 23;
			}
			else {
				hour--;
			}
		}
		
		return this;
	}
	
	public MyTime previousMinute() {
		
		boolean checkSubtractHour = false;
		
		if(minute == 0) {
			minute = 59;
			checkSubtractHour = true;
		}
		else {
			minute--;
		}
		
		if(checkSubtractHour == true) {
			if(hour == 0) {
				hour = 23;
			}
			else {
				hour--;
			}
		}
		
		return this;
	}
	
	public MyTime previousHour() {
		
		if(hour == 0) {
			hour = 23;
		}
		else {
			hour--;
		}
		
		return this;
	}
}
