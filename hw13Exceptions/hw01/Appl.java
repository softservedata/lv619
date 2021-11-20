package hw13Exceptions.hw01;

import java.util.Scanner;

public class Appl {
	
	public static double div(double a, double b) throws ArithmeticException{
		if (b == 0) {
			throw new ArithmeticException("Dividing by zero!");
		}
		return a/b;
	}
	
	private static int readNumber(int start, int end) throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number in range from " + start + " to " + end );
		int i = sc.nextInt();
		if(i < start || i > end ) {
			throw new NumberFormatException("Number is not in range");
		}
		return i;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(Appl.div(10, 2));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " Try one more time");
			
		}
		
		int start = 1;
		int preend = 10;
		int totalend = 100;
		
		for (int i = 0; i < 10; i++) {
			//Appl.readNumber(start, preend);
			start = Appl.readNumber(start, preend);
			preend += start;
			if(start >= totalend) {
				break;
			}
		}
		
	}

}
