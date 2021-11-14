package _06_oop_1.pt2;

final class Point {
	////////////////////////////////////////////////////////////////////////////
	private int x;
	private int y;
	////////////////////////////////////////////////////////////////////////////
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "(" + x + "," + y + ")\t";
	}
	////////////////////////////////////////////////////////////////////////////
}