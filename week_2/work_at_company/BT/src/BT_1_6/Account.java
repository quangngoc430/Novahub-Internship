package BT_1_6;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int credit(int amount) {
		balance = balance + amount;
		return balance;
	}
	
	public int debit(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		
		return balance;
	}
	
	public int transfer(Account another, int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			another.setBalance(another.getBalance() + amount);
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		
		return balance;
	}

	@Override
	public String toString() {
		return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
	}	
}
