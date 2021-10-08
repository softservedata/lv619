package hw07OOP.task2;

public class App {
	public static void main(String[] args) {
		Line [] lines = new Line [4];
		lines[0] = new Line(new Point(1, 1), new Point(2, 2));
		lines[1] = new ColorLine(new Point(1,2), new Point(2,1), "blue");
		lines[2] = new Line(new Point(3, 4), new Point(5, 6));
		lines[3] = new ColorLine(new Point(4,3), new Point(6,5), "yelow");
		
		
		for (Line current : lines) {
			current.print();
		}
	}

}
