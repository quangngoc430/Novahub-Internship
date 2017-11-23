package BT_1_8;

import org.junit.Test;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time nextSecond() {
		boolean plusMinute = false;
		boolean plusHour = false;
		
		if(second < 59) {
			second++;
		}
		else {
			second = 0;
			plusMinute = true;
		}
		
		if(plusMinute == true) {
			if(minute < 59) {
				minute++;
			}
			else {
				minute = 0;
				plusHour = true;
			}
		}
		
		if(plusHour == true) {
			if(hour < 23) {
				hour++;
			}
			else {
				hour = 0;
			}
		}
		
		return this;
	}
	
	public Time previousSecond() {
		boolean minusMinute = false;
		boolean minusHour = false;
		
		if(second > 0){
			second--;
		}
		else {
			second = 59;
			minusMinute = true;					
		}
		
		if(minusMinute == true) {
			if(minute > 0) {
				minute--;
			}
			else {
				minute = 59;
				minusHour = true;
			}
		}
		
		if(minusHour == true) {
			if(hour > 0) {
				hour--;
			}
			else {
				hour = 23;
			}
		}
		
		return this;
	}
	
	@Override
	public String toString() {
		String output = "";
		
		if(hour < 10) {
			output += "0" + hour;
		}
		else {
			output += hour;
		}
		
		output += ":";
		
		if(minute < 10) {
			output += "0" + minute;
		}
		else {
			output += minute;
		}
		
		output += ":";
		
		if(second < 10) {
			output += "0" + second;
		}
		else {
			output += second;
		}
		
		return output;
	}
}
	

	
	