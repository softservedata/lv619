package hw05ConditonalStatements;
import java.util.Scanner;
import java.io.IOException;



public class PractTask1 {
	
	public static int count = 0;
	
	public static void checkOdd(int x) {
		if (x % 2 != 0) {
		count++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("Print the first number");
		num1 = sc.nextInt();
		checkOdd(num1);
		System.out.println("Print the second number");
		num2 = sc.nextInt();
		checkOdd(num2);
		System.out.println("Print the third number");
		num3 = sc.nextInt();
		checkOdd(num3);
		sc.close();
		
		System.out.println(count + " of 3 enteted numbers are odd");
		
	}

}
