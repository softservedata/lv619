package com.softserve.edu05;
import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arrayOfNumbers = new int[10];

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			arrayOfNumbers[i] = in.nextInt();
		}
		CalcArrays calcArrays = new CalcArrays(arrayOfNumbers);
		int result = calcArrays.calcSum();
		System.out.println(result);

		
	}
}
