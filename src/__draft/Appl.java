package __draft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	// In the next method calculate amount of characters in the string. Need to find logic errors
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int countCharacters = 0;
		String testWord = "";
		char character = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Input word");
			testWord = br.readLine();
			System.out.println("Input character");
			character = (char) br.read();
		} catch (IOException e) {}
		for (int i = 0; i < testWord.length(); i++)
			if (testWord.charAt(i) == character)
				countCharacters++;
		System.out.print("There " + (countCharacters < 2 ? "is " : "are "));
		System.out.print(countCharacters == 0 ? "no" : countCharacters);
		System.out.print(" \'" + character + "\' character");
		System.out.print(countCharacters != 1 ? "s " : " ");
		System.out.println("in the word " + testWord);
	}
	////////////////////////////////////////////////////////////////////////////
}