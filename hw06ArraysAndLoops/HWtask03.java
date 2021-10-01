package hw06ArraysAndLoops;

import java.util.Scanner;

public class HWtask03 {
	
public static void main(String[] args) {
		
		int [] numbers = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter " + (i+1) + " number:");
			numbers[i] = sc.nextInt();
		}
		
		int countPositive = 0;
		int secondPositive = Integer.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				countPositive++;
				if(countPositive == 2) {
					secondPositive = numbers[i];
				}
			}	
		}
		
		
		int min = Integer.MAX_VALUE;
		int imin = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				imin = i;
				min = numbers[i];
			}
		}
		
	
		System.out.println(secondPositive);
		System.out.println(imin);
		System.out.println(min);
		sc.close();
	
	}

}
