package _10_string_regularExpression.hw2;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Enter a sentence that contains the words between more than one space.
	//	Convert all spaces, consecutive, one.
	//	For example, if we introduce the sentence
	//	"I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		String sentence = "";
		for(int i = 0, n = randInt(4, 10); i < n; ++i)
			sentence += " ".repeat(randInt(2, 5)) + randLettersStringTitleCase().toLowerCase() + " ".repeat(randInt(2, 5));
		System.out.println("\t\t\t\torigin:\n" + (sentence += "."));
		sentence = sentence.substring(0, sentence.length() - 1).trim().replaceAll(" {2,}+", " ") + ".";
		System.out.println("\t\t\t\tupdated:\n" + sentence);
	}
	////////////////////////////////////////////////////////////////////////////
}