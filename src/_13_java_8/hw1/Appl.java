package _13_java_8.hw1;

import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	There is a list of strings list1.
	//	Create a new list list2 that has items from list1 and
	//	length less than 5 characters (use method removeIf)
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		List<String> list1 = Stream.generate(() -> randLettersStringTitleCase()).limit(randInt(5, 10)).toList();
		List<String> list2 = new ArrayList<>();
		list2.addAll(list1);
			list2.removeIf(s -> s.length() >= 5);
		System.out.println("list1:\n" + list1.toString().substring(1, list1.toString().length() - 1)
				+ "\nlist2:\n" + list2.toString().substring(1, list2.toString().length() - 1));
	}
	////////////////////////////////////////////////////////////////////////////
}