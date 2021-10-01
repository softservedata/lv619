package hw06ArraysAndLoops;

import java.util.Scanner;

public class PracTask1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int [10];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Print " + (i+1) + " number of array:");
			numbers[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] > max) {
				max = numbers[j];
			}
		}
		
		int sumofPositive = 0;
		for (int k = 0; k < numbers.length; k++) {
			if(numbers[k] > 0) {
				sumofPositive += numbers[k];
			}
		}
		
		int count = 0;
		for (int h = 0; h < numbers.length; h++) {
			if(numbers[h] < 0) {
				count++;
			}
		}
		
		System.out.println("Sum of positive elements is " + sumofPositive);
		System.out.println("The biggest number is " + max);
		System.out.println("Number of negative elements is " + count);
		
		sc.close();
	}

}
