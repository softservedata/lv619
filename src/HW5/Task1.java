package HW5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);

		System.out.print("Enter value of a:");
		int a = Integer.parseInt(str.nextLine());

		System.out.print("Enter value of b:");
		int b = Integer.parseInt(str.nextLine());

		System.out.print("Enter value of c:");
		int c = Integer.parseInt(str.nextLine());

		if (a % 2 == 0) {
			System.out.print(a + "\t");
		}
		if (b % 2 == 0) {
			System.out.print(b + "\t");
		}
		if (c % 2 == 0) {
			System.out.println(c + "\t");
		}
	}

}
