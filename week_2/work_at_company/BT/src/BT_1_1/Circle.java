package BT_1_1;

public class Circle{
	private double radius;
	private String color;

	public Circle(){}

	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public void setColor(String color){
		this.color = color;
	}

	public double getRadius(){
		return this.radius;
	}

	public String getColor(){
		return this.color;
	}

	public double getArea(){
		return this.radius * this.radius * Math.PI;
	}

	public String toString(){
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}
}