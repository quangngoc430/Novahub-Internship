package BT_4_2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		return "Staff[Person[name=" + this.getName() + ",address=" + this.getAddress() + "],school=" + school + ",pay=" + formatter.format(pay) + "]";
	}
	
	
	
}
