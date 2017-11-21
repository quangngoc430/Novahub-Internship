package BT_2_2;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Book(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public String getAuthorNames() {
		String output = "";
		
		for(Author author : authors) {
			output += author.getName() + ",";
		}
		
		output = output.substring(0, output.length() - 1);
		
		return output;
	}
		
	@Override
	public String toString() {
		String output = "Book[name=" + name + ",authors={";
		
		for(Author author : authors) {
			output += author.toString() + ",";
		}
		
		output = output.substring(0, output.length() - 1);
		output += "},";
		
		output += "price=" + price + ",qty=" + qty + "]";
		
		return output;
	}
	
}
