package hw06ArraysAndLoops;

import java.util.Scanner;

public class HWtask01 {
	
	public static void main(String[] args) {
		
		int [] mounthDays = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input number of mounth(from 1 to 12):");
		int n = sc.nextInt();
		
		System.out.println((n < 13) && (n > 0) ? "Mounth has " + mounthDays[n-1] + " days." : "Wrong number of mounth");
		sc.close();
		
	}
	


}
