package BT_2_7;

public class Invoice {
	private int ID;
	private Customer customer;
	private double amount;
	
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Invoice(int iD, Customer customer, double amount) {
		super();
		ID = iD;
		this.customer = customer;
		this.amount = amount;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmountAfterDiscount() {
		return this.amount - this.customer.getDiscount();
	}
}
