package _11_exceptions.pt1;
import java.util.Scanner;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create a method for calculating the area of a rectangle 
	//	int squareRectangle (int a, int b), 
	//	which should throw an exception if the user enters negative value.
	//	Input values a and b from console. Check the squareRectangle method in the method main.
	//	Check to input nonnumeric value.
	////////////////////////////////////////////////////////////////////////////
	private static final Scanner in = new Scanner(System.in);
	////////////////////////////////////////////////////////////////////////////
	private static int getRectangleArea(int a, int b) throws IllegalArgumentException{
		if(a < 0 || b < 0)
			throw new IllegalArgumentException("negative side length");
		return a * b;
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(in.nextLine());
			int b = Integer.parseInt(in.nextLine());
			System.out.println("a = " + a + ", b = " + b + ", area = " + getRectangleArea(a, b));
		} catch (NumberFormatException e){
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	////////////////////////////////////////////////////////////////////////////
}