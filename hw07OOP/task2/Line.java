package hw07OOP.task2;

public class Line {
	//
	Point p1;
	Point p2;
	/*-
	
	public Line (int x1, int y1, int x2, int y2) {
		p1.setX(x1);
		p1.setY(y1);
		p2.setX(x2);
		p2.setY(y2);
	}
	*/
	
	public Line (Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public String toString() {
		return "Begin of Line: " + p1 + ", end of line: " + p2; 
	}

}
