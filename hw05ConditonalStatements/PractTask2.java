package hw05ConditonalStatements;

import java.util.Scanner;

public class PractTask2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select number of day(from 1st to 7th:");
		int numberofDay = sc.nextInt();
		
		switch (numberofDay) {
		
		case 1:
			System.out.println("Monday / �������� / Montag");
			break;
		
		case 2:
			System.out.println("Tuesday / ³������ / Dienstag");
			break;
		
		case 3:
			System.out.println("Wednesday / ������ / Mittwoch");
			break;
		
		case 4:
			System.out.println("Thursday / ������ / Donnerstag");
			break;
			
		case 5:
			System.out.println("Friday / �'������ / Freitag");
			break;
			
		case 6:
			System.out.println("Saturday / ������ / Samstag");
			break;
			
		case 7:
			System.out.println("Sunday / ����� / Sonntag");
			break;
			
		default:
			System.out.println("There are only 7 days in a week");
			throw new IllegalArgumentException("Error: Invalid Argument");
			
			
			
		}
	}

}
