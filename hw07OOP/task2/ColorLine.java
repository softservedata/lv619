package hw07OOP.task2;

public class ColorLine extends Line {
	
	String color;
	
	public ColorLine(Point p1, Point p2, String color) {
		super(p1, p2);
		this.color = color;
	}
	
	public String toString() {
		return super.toString() + ", color = " + color;
	}

}
