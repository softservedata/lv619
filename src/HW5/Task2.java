package HW5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		String[] arrayEnglish = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String[] arrayGerman = { "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag" };
		String[] arrayUkrainian = { "Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя" };

		System.out.print("Enter The number of the day:");
		int n = Integer.parseInt(str.nextLine());

		System.out.print(arrayEnglish[n - 1] + "\t");
		System.out.print(arrayGerman[n - 1] + "\t");
		System.out.print(arrayUkrainian[n - 1] + "\t");
	}

}
