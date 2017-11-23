package BT_4_5;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width * length;
	}
	
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
	}
	
}
