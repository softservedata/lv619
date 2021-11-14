package _06_oop_1.pt2;
import java.awt.Color;

import static __myLib.Rand.randInt;

class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create three classes: 
	//	Point with attributes x and y
	//	Line which contains two object of Point class
	//	ColorLine with attributes Color  which extends Line class.
	//	Override method toString() and define method print() in every classes
	//	In main() method create array of Line and add some Line and ColorLine to it.
	//	Call method print() for all of it. 
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Line[] lines = new Line[6];
		for(int i = 0; i < lines.length; ++i) {
			lines[i] = randInt(1) == 0 ?
					new Line(
							new Point(randInt(-100, 100), randInt(-100, 100)),
							new Point(randInt(-100, 100), randInt(-100, 100))) : 
					new ColorLine(
							new Point(randInt(-100, 100), randInt(-100, 100)),
							new Point(randInt(-100, 100), randInt(-100, 100)),
							new Color(randInt(255), randInt(255), randInt(255)));
			lines[i].print();
		}
	}
	////////////////////////////////////////////////////////////////////////////
}