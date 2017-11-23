package BT_4_2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		return "Student[Person[name=" + this.getName() 
		+ ",address=" + this.getAddress() 
		+ "],program=" + program 
		+ ",year=" + year 
		+ ",fee=" + formatter.format(fee) + "]";
	}

	
	
	
	
}
