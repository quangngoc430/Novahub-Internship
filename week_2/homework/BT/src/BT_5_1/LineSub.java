package BT_5_1;

public class LineSub extends Point{
	Point end;
	
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new Point(endX, endY);
	}
	
	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}
	
	public Point getBegin() {
		return new Point(super.getX(), super.getY());
	}
	
	public Point getEnd() {
		return end;
	}
	
	public void setBegin(Point begin) {
		super.setX(begin.getX());
		super.setY(begin.getY());
	}
	
	public void setEnd(Point end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return super.getX();
	}
	
	public int getBeginY() {
		return super.getY();
	}
	
	public int getEndX() {
		return end.getX();
	}
	
	public int getEndY() {
		return end.getY();
	}
	
	public void setBeginX(int x) {
		super.setX(x);
	}
	
	public void setBeginY(int y) {
		super.setY(y);
	}
	
	public void setBeginXY(int x, int y) {
		super.setXY(x, y);
	}
	
	public void setEndX(int x) {
		end.setX(x);
	}
	
	public void setEndY(int y) {
		end.setY(y);
	}
	
	public void setEndXY(int x, int y) {
		end.setX(x);
		end.setY(y);
	}
	
	public int getLength() {
		double xDiff = Math.abs(end.getX() - super.getX());
		double yDiff = Math.abs(end.getY() - super.getY());
		return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	
	public double getGradient() {
		double xDiff = Math.abs(end.getX() - super.getX());
		double yDiff = Math.abs(end.getY() - super.getY());
		return Math.atan2(xDiff, yDiff);
	}
	
	@Override
	public String toString() {
		return "Line(" + getBeginX() + "," + getBeginY() + ") -> (" + getEndX() + "," + getEndY() + ")";
	}
}
