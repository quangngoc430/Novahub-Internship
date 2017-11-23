package BT_4_5;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		String output = "A Shape with color of " + color + " and ";
		
		if(filled == true) {
			output += "filled";
		}
		else {
			output += "Not filled";
		}
		
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	
	
}
