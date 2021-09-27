package hw05ConditonalStatements;

import java.util.Scanner;

public class HWtask2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = new int[3];
		for (int i = 0; i<numbers.length; i++) {
			System.out.println("Enter your " + (i+1) + " number: ");
			numbers[i] = sc.nextInt();
		
		}
		int max = Integer.MIN_VALUE;
		int j = 0;
		while (j < numbers.length) {
			if (numbers[j] > max) {
				max = numbers[j];
			}
			j++;
		}
		
		int min = Integer.MAX_VALUE;
		int k = 0;
		while (k < numbers.length) {
			if (numbers[k] < min) {
				min = numbers[k];
			}
			k++;
		}
		
		System.out.println("Max value is " + max);
		System.out.println("Min value is " + min);
		//System.out.println(j);
		sc.close();
	}

}
