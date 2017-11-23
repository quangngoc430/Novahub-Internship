package BT_2_7;

public class Customer {
	private int ID;
	private String name;
	private int discount;
	
	public Customer() {
		super();
	}
	
	public Customer(int iD, String name, int discount) {
		super();
		ID = iD;
		this.name = name;
		this.discount = discount;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return name + "(" + ID + ")";
	}
}
