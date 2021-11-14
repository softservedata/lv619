package _11_exceptions.hw;
import static __myLib.Rand.randInt;
import java.util.Scanner;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create method div(), which calculates the dividing of two double numbers.
	//	In main method input 2 double numbers and call this method. Catch all exceptions. 
	//	Write a method readNumber(int start, int end), that
	//	read from console integer number and return it, if it is in the range [start...end]. 
	//	If an invalid number or non-number text is read, the method should throw an exception. 
	//	Using this method write a method main(), that has to enter 10 numbers:
	//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
	//	Refactor your previous homework (1-7) and try to handle all possible exceptions in your code
	////////////////////////////////////////////////////////////////////////////
	private static Scanner in = new Scanner(System.in);
	////////////////////////////////////////////////////////////////////////////
	private static double div(double a, double b) throws ArithmeticException{
		if(b == 0)
			throw new ArithmeticException("dividing by zero");
		return a / b;
	}
	////////////////////////////////////////////////////////////////////////////
	private static int readNumber(int start, int end) throws NumberFormatException{
		System.out.print("enter number, that belongs t range: " + start + " - " + end + "\n:");
		int num = Integer.parseInt(in.nextLine());
		if(num < start || num > end)
			throw new NumberFormatException("number out of range");
		return num;
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		double a = Math.round((randInt(-100, 100) + (1 / (double)randInt(-100, 100))) * 100) / 100d;
		double b = Math.round((randInt(-100, 100) + (1 / (double)randInt(-100, 100))) * 100) / 100d;
		try {
			System.out.println(a + " / " + b + " = " + Math.round(div(a ,b) * 100) / 100d);
			for(int i = 0; i < 10; ++i)
				readNumber(1 + i * 10, 10 *(i + 1));
		}catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	////////////////////////////////////////////////////////////////////////////
}