package hw06ArraysAndLoops;

import java.util.Scanner;

public class HWtask03_2 {

public static void main(String[] args) {
		
		int [] numbers = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		for (; i < numbers.length; i++) {
			System.out.println("Enter " + (i+1) + " number:");
			numbers[i] = sc.nextInt();
			if (numbers[i] < 0) {
				break;
			}
		}
		
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		
		
		int product = 1;
		for (int k = 0; k < i; k++) {
			product *= numbers[k]; 
		}
		System.out.println("i = " + i);
		System.out.println("product = " + product);
		sc.close();
	}
}
