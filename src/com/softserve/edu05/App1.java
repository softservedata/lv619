package com.softserve.edu05;
import java.util.Scanner;

public class App1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfMonth = in.nextInt();
		CheckMonth check = new CheckMonth(numberOfMonth);
		System.out.println(check.check());

	}
}
