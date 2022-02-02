package __draft;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Appl {
	////////////////////////////////////////////////////////////////////////////
	// In the next method calculate amount of characters in the string. Need to find logic errors
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {

		System.out.println("123_456_789_".matches("(?:\\d+_)+"));                               // true
		System.out.println("123_456_789_".matches("d+_+"));                                              // false

		System.out.println("123_456_123_789_".matches("(\\d+_)(?:\\d+_)\\1(?:\\d+_)"));                 //true
		System.out.println("123_456_789_abc_".matches("(\\d+_)(?:\\d+_)\\1(?:\\d+_)"));                 //false

		System.out.println("123_456_123_789_".matches("(?from1to3\\d+_)(?:\\d+_)\\from1to3(?:\\d+_)")); //true
		System.out.println("123_456_789_abc_".matches("(?from1to3\\d+_)(?:\\d+_)\\from1to3(?:\\d+_)")); //false
	}
	////////////////////////////////////////////////////////////////////////////
}