package com.softserve.edu5;
import java.util.Scanner;

public class App3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[5];
		int position;
		int min;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		FindNumbers findNumbers = new FindNumbers(numbers);
		position = findNumbers.findPos();
		min = findNumbers.findMin();


		System.out.println("Minimum values in array is " + min + " at position " + position);
		in.close();
	}
}
