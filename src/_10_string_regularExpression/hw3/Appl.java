package _10_string_regularExpression.hw3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Implement a pattern for US currency:
	//	the first symbol "$", then any number of digits,
	//	dot and two digits after the dot.
	//	Enter the text from the console that contains several occurrences of US currency.
	//	Display all occurrences on the screen.
	////////////////////////////////////////////////////////////////////////////	
	private static final String text = AdditionalMethods.getRandText();
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("\t\t\t\t\t\t\t\tthe text:\n" + text);
		Matcher m = Pattern.compile(__myLib.MyString.REGEX.US_CURRENCY, Pattern.MULTILINE).matcher(text);
		System.out.println("__________________________\noccurences of us currency:");
		for(int i = 0; m.find();)
			System.out.println(++i + ") " + m.start() + "-" + (m.end() - 1) + ": " + m.group());
	}
	////////////////////////////////////////////////////////////////////////////
}