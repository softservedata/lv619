package _06_oop_1.pt2;
import java.awt.Color;

final class ColorLine extends Line{
	////////////////////////////////////////////////////////////////////////////
	Color color;
	ColorLine(Point start, Point end, Color color) {
		super(start, end);
		this.color = color;
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return super.toString() + " colorRGB" + '(' + 
				color.toString().substring(
						color.toString().indexOf('[') + 1).replace(']', ')');
	}
	////////////////////////////////////////////////////////////////////////////
}