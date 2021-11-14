package _01_introduction.hw;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create Console Application project in Java.
	//	In method main() write code for solving next tasks:
	//1)Define integer variables a and b. Read values a and b from Console and calculate: 
	//	a + b 
	//	a - b 
	//	a * b 
	//	a / b. 
	//2)Output obtained results.
	//	Output question “How are you?“. Define string variable answer.
	//	Read the value answer and output: “You are (answer)".
	////////////////////////////////////////////////////////////////////////////
	private static void task1() throws ArithmeticException{
		int a = __myLib.Rand.randInt(-100, 100), b = __myLib.Rand.randInt(-100, 100);
		System.out.println("a = " + a + "\tb = " + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
	}
	////////////////////////////////////////////////////////////////////////////
	private static void task2() {
		System.out.println("How are you?");
		String answer ="fine";
		System.out.println("You are " + answer);
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try { task1();
		} catch (ArithmeticException e) { System.out.println(e.getMessage()); }
		System.out.println("-".repeat(20));
		task2();
	}
	////////////////////////////////////////////////////////////////////////////
}