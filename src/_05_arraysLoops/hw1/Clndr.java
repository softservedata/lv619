package _05_arraysLoops.hw1;
import java.time.Month;

public class Clndr {
	////////////////////////////////////////////////////////////////////////////
	final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	////////////////////////////////////////////////////////////////////////////
	public String getDaysInMonthToString(Month month){
		return month == null || month.equals(null) ?
				"" : "" + (month.ordinal() ==  1 ? "28 (29)" : 
			daysInMonths[month.ordinal()]);
	}
	////////////////////////////////////////////////////////////////////////////
}
