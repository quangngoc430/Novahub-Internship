package BT_2_8;

import java.text.DecimalFormat;

public class Account {
	private int ID;
	private Customer customer;
	private double balance = 0.0;
	
	public Account() {
		super();
	}
	
	public Account(int iD, Customer customer) {
		super();
		ID = iD;
		this.customer = customer;
	}
	
	public Account(int iD, Customer customer, double balance) {
		super();
		ID = iD;
		this.customer = customer;
		this.balance = balance;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat(".00");
		return customer.toString() + " balance=$" + format.format(balance);
	}
	
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
	
	public Account deposit(double amount) {
		this.balance += amount;
		
		return this;
	}
	
	public Account withdraw(double amount) {
		if(balance >= amount) {
			this.balance -= amount;
		}
		else {
			System.out.println("amount withdrawn exceeds the current balance");
		}
		
		return this;
	}
	
}
