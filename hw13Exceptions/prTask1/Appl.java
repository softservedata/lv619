package hw13Exceptions.prTask1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Appl {
	
	public static int squareRectangle(int a, int b) throws IllegalArgumentException{
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException();
		}
		return a*b;
	}
	
	
	public static int trySquareRectangle(int a, int b) {
        //your code
        try {
            squareRectangle(a, b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
		return a * b;
    }  
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("Input a:");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("Input b:");
			int b = sc.nextInt();
			System.out.println("Area = " + squareRectangle(a, b));
		} catch (InputMismatchException i) {
			System.out.println(i.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
