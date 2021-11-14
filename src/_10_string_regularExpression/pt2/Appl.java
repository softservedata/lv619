package _10_string_regularExpression.pt2;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Enter surname, name and patronymic on the console as a variable of type String.
	//	Output on the console:
	//	 - surnames and initials
	//	 - name
	//	 - name, middle name and last name
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
	String name	= randLettersStringTitleCase();
	String surname	= randLettersStringTitleCase();
	String patronymic	= randLettersStringTitleCase();
	System.out.printf("surname and intials: %s %C.%C.%n",
			surname, name.charAt(0), patronymic.charAt(0));
	System.out.println("name: " + name);
	System.out.println("name: " + name + "\tmiddle name: " +
			patronymic + "\tlast name: " + surname);
	}
	////////////////////////////////////////////////////////////////////////////
}