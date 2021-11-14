package _10_string_regularExpression.hw1;
import java.util.List;

import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Enter in the console sentence of five words. 
	//	display the longest word in the sentence
	//	determine the number of its letters
	//	bring the second word in reverse order
	////////////////////////////////////////////////////////////////////////////
	private static String getRandPunctuation() {
		switch (randInt(4)) {
		default: return ", ";
		case 1: return " - ";
		case 2: return "-";
		case 3: return ": ";
		case 4: return "; ";
		}
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		List<String> wordsInSentence= new ArrayList<>(5);
		
		{
			String sentence = randLettersStringTitleCase();
			for(int i = 0; i < 4; ++i)
				sentence += (randInt(4) == 0 ? getRandPunctuation() : " ") +
				randLettersStringTitleCase().toLowerCase();
			System.out.println("\t\torigin:\n" + (sentence += "."));
			Matcher m = Pattern.compile("(?:(?>\\b[a-z]+\\b|\\b^[A-Z][a-z]*\\b))").
					matcher(sentence);
			while(m.find())
				wordsInSentence.add(sentence.substring(m.start(), m.end()));
		}
		
		String longestWord = wordsInSentence.get(0);
		int amountOfLetters = longestWord.length();
		for(String word: wordsInSentence.subList(1, wordsInSentence.size())) {
			amountOfLetters += word.length();
			if(word.length() > longestWord.length())
				longestWord = word;
		}			
		System.out.println("\nlongest word:\t" + longestWord);
		System.out.println("number of letters:\t" + amountOfLetters);
		System.out.println("reversed second word:\t" + 
				new StringBuilder(wordsInSentence.get(1)).reverse());
	}
	////////////////////////////////////////////////////////////////////////////
}