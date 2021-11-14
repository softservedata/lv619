package _10_string_regularExpression.hw3;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

class AdditionalMethods {
	////////////////////////////////////////////////////////////////////////////
	private static final AdditionalMethods instance = new AdditionalMethods();
	////////////////////////////////////////////////////////////////////////////
	private String getRandDelimiter() {
		switch (randInt(4)) {
		default: return "";
		case 1: return ",";
		case 2: return "'";
		case 3: return "`";
		case 4: return " ";
		}
	}
	////////////////////////////////////////////////////////////////////////////
	private String getRandUS_Price() {
		StringBuilder price = new StringBuilder("$" + randInt(1, 999));
		String delimiter = getRandDelimiter();
		for(int i = 0, n  = randInt(4); i < n; ++i)
			price.append(delimiter).append(
					String.valueOf(randInt(1, 999) + 1000).substring(1));
		return price.append('.').append(
				String.valueOf(randInt(99) + 100).substring(1)).toString();
	}
	////////////////////////////////////////////////////////////////////////////
	private String getRandPunctuation() {
		switch (randInt(7)) {
		default: return "\n";
		case 1: return ". ";
		case 2: return "! ";
		case 3: return "? ";
		case 4: return ", ";
		case 5: return "; ";
		case 6: return "-";
		case 7: return " - ";
		}
	}
	////////////////////////////////////////////////////////////////////////////
	static String getRandText() {
		StringBuilder res = new StringBuilder(
				randInt(1) == 0 ? instance.getRandUS_Price() : randLettersStringTitleCase().toLowerCase());
		for(int i = 0, n = randInt(5, 20); i < n; ++i)
			res.append(randInt(4) == 0 ? instance.getRandPunctuation() : " ").
			append(randInt(6) == 0 ? randInt(-1000000000, 1000000000) :
				randInt(4) == 0 ? instance.getRandUS_Price() : randLettersStringTitleCase().toLowerCase()); 
		return res.toString();
	}
	////////////////////////////////////////////////////////////////////////////
}