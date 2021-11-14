package _10_string_regularExpression.pt1;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Enter the two variables of type String.
	//	Determine whether the first variable substring second.
	//	For example, if you typed «IT» and «IT Academy» you must receive true.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		String str = randInt(1) == 0 ? "str" : randLettersStringTitleCase();
		String str2 = randInt(1) == 0 ? "str2" : randLettersStringTitleCase();
		System.out.println("str: " + str + "\nstr2: " + str2);
		System.out.println(str2.contains(str));
	}
	////////////////////////////////////////////////////////////////////////////
}