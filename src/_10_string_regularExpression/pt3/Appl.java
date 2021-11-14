package _10_string_regularExpression.pt3;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

import java.util.Stack;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	The user name can be 3 to 15 characters of
	//	the Latin alphabet, numbers, and underscores.
	//	Using regular expressions implement checking the user name for validity.
	//	Input five names in the main method .
	//	Output a message to the console of the validation of each of the entered names.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Stack<String> userNames = new Stack<>();
		StringBuilder tmp;
		while(userNames.size() != 5)
			userNames.push((tmp = new StringBuilder(randLettersStringTitleCase())).
					insert(randInt(0, tmp.length()), (char)randInt(32, 126)).toString());
		System.out.println(userNames);
		while(!userNames.isEmpty())
			System.out.println('\n' + userNames.peek() + " is" + 
					(userNames.pop().matches("\\w{3,15}") ? " " : " not ") +
					"valid name");
	}
	////////////////////////////////////////////////////////////////////////////
}