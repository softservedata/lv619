package hw07OOP.task2;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {}
	
	public Point (int xCoord, int yCoord) {
		this.x = xCoord;
		this.y = yCoord;
	}
	
	public void setX (int a) {
		this.x = a;
	}
	
	public void setY (int b) {
		this.y = b;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "x = " + getX() + ", y = " + getY();
	}
}
