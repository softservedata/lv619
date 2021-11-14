package _13_java_8.hw3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create method to validate date according to format "mm.dd.yy"
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		String date = __myLib.Rand.randDateStr(0, 99).replaceAll("^((?:[0-2]?[0-9]\\b)|(?:3[01]))(\\D)((?:0?[1-9]\\b)|(?:1[0-2]))", "$3$2$1");
		System.out.print('\"' + date +  "\" is ");
		try {
			LocalDate.parse(date, DateTimeFormatter.ofPattern("MM.dd.yy"));	
		} catch(DateTimeParseException e) {
			System.out.print("not ");
		}
		finally {
			System.out.println("valid");
		}
	}
	////////////////////////////////////////////////////////////////////////////
}