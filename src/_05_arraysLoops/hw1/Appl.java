package _05_arraysLoops.hw1;
import static __myLib.ConsoleInputReader.getCorrectIntValue;

import java.time.Month;;

class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Ask user to enter the number of month.
	//	Read the value and write the amount of days in this month
	//	(create array with amount days of each month).
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.print("enter month number\n:");
		int num;
		while((num = getCorrectIntValue()) > 12 || num < 1)
			System.out.print("invalid input data. please retry\n:");
		System.out.println(Month.of(num).name().toLowerCase() + ' ' +
				new Clndr().getDaysInMonthToString(Month.of(num)));
	}
	////////////////////////////////////////////////////////////////////////////
}
