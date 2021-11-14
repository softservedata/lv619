package _13_java_8.hw2;

import java.util.stream.Collectors;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
	//	Method encrypt should take a string and return coded string where
	//	every letter is moved on n positions in alphabet (e.g. encrypt("abc", 3)
	//	returns "def“). Method decrypt should return decoded value
	////////////////////////////////////////////////////////////////////////////
	private static void check(String s, int n)  throws IllegalArgumentException{
		if(n < 0 || !s.matches("^[a-zA-Z]+$"))
			throw new IllegalArgumentException();
	}
	
	static String encrypt(String s, int n) throws IllegalArgumentException{
		check(s, n);
		return s.chars().boxed().map(c -> "" + (char)(c + n - (c <= 90 && c + n > 90 || c + n >122 ? 26 : 0))).collect(Collectors.joining());		
	}
	
	static String decrypt(String s, int n) {
		check(s, n);
		return s.chars().boxed().map(c -> "" + (char)(c - n + (c >= 97 && c - n < 97 || c - n < 65 ? 26 : 0))).collect(Collectors.joining());	
	}
	
	public static void main(String[] args) {
		String s = __myLib.Rand.randLettersStringTitleCase();
		int n = __myLib.Rand.randInt(1, 5);
		System.out.println("origin: " + s + "\t\tn = " + n);
		System.out.println("encrypted: " + (s = encrypt(s, n)));
		System.out.println("decrypted: " + decrypt(s, n));
	}
	////////////////////////////////////////////////////////////////////////////
}