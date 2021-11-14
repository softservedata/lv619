package _01_introduction.pt;
import static __myLib.Rand.randInt;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create console application. In method main() write code for solving next tasks:
	//1)Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius.
	//	Output obtained results.
	//2)Define String variables name and address.
	//	Output question "What is your name?" Read the value name and output next question:
	//	“Where are you live, (name)?". Read address and write whole information.
	//3)Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute.
	//	Talks continued t1, t2 and t3 minutes.
	//	How much computer will count for each call separately and all talk together?
	//	Input all source data from console, make calculations and output to the screen.
	////////////////////////////////////////////////////////////////////////////
	private static void task1() {
		int r = randInt(1, 10);
		System.out.println("radius = " + r
				+ "\nperimetr = " +  2 * r * Math.round(Math.PI * 100) / 100d
				+ "\narea = " + r * r * Math.round(Math.PI * 100) / 100d);
	}
	////////////////////////////////////////////////////////////////////////////
	private static void task2() {
		String name = "Name1", adress = "adress1";
		System.out.println("What is your name? - " + name + '.');
		System.out.println("Where do you live, " + name + "? - " + adress + '.');
	}
	////////////////////////////////////////////////////////////////////////////
	private static void task3() {
		int t1 = randInt(1, 10), t2 = randInt(1, 10), t3 = randInt(1, 10);
		System.out.println("t1 lasted " + t1 + " minutes");
		System.out.println("t2 lasted " + t2 + " minutes");
		System.out.println("t3 lasted " + t3 + " minutes");
		System.out.println("total calls duration = " + (t1 + t2 + t3));
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		task1();
		System.out.println("-".repeat(20));
		task2();
		System.out.println("-".repeat(20));
		task3();
	}
	////////////////////////////////////////////////////////////////////////////
}