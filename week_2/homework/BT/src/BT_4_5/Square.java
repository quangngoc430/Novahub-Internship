package BT_4_5;

public class Square extends Rectangle{
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	
	@Override
	public void setWidth(double side) {
		this.setWidth(side);
	}
	
	@Override
	public void setLength(double side) {
		this.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString(); 
	}
}
