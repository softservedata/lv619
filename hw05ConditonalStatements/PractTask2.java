package hw05ConditonalStatements;

import java.util.Scanner;

public class PractTask2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select number of day(from 1st to 7th:");
		int numberofDay = sc.nextInt();
		
		switch (numberofDay) {
		
		case 1:
			System.out.println("Monday / Понеділок / Montag");
			break;
		
		case 2:
			System.out.println("Tuesday / Вівторок / Dienstag");
			break;
		
		case 3:
			System.out.println("Wednesday / Середа / Mittwoch");
			break;
		
		case 4:
			System.out.println("Thursday / Четвер / Donnerstag");
			break;
			
		case 5:
			System.out.println("Friday / П'ятниця / Freitag");
			break;
			
		case 6:
			System.out.println("Saturday / Субота / Samstag");
			break;
			
		case 7:
			System.out.println("Sunday / Неділя / Sonntag");
			break;
			
		default:
			System.out.println("There are only 7 days in a week");
			throw new IllegalArgumentException("Error: Invalid Argument");
			
			
			
		}
	}

}
