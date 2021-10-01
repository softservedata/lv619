package hw06ArraysAndLoops;

import java.util.Scanner;

public class HWtask02 {
	
public static void main(String[] args) {
		
		int [] numbers = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter " + (i+1) + " number:");
			numbers[i] = sc.nextInt();
		}
		
		boolean check = true;
		
		for (int j = 0; j < 5; j++) {
			if (numbers[j] < 0) {
				check = false;
			}
			
		}
		
		//int product = 1;
		//int sum = 0;
		
		
		int finalresult = 0;
		
		if (check) {
			finalresult = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		} 
		else {
			finalresult = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
		}
		
		
		System.out.println(check);
		System.out.println(finalresult);
		sc.close();


	}
}
