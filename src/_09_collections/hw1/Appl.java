package _09_collections.hw1;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

import java.util.Collections;


public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Write parameterized methods union(Set set1, Set set2) and
	//	intersect(Set set1, Set set2), realizing the operations of union and
	//	intersection of two sets. Test the operation of these techniques on two pre-filled sets. 
	////////////////////////////////////////////////////////////////////////////
	static <T1, T2> Set<Object> union(final Set<T1> set1, final  Set<T2> set2) {
		if(set1 == null || set2 == null) return Collections.emptySet();
		Set<Object> res = new LinkedHashSet<>(set1);
		res.addAll(set2);
		return res;
	}
	////////////////////////////////////////////////////////////////////////////
	static <T> Set<Object> intersect(final Set<T> set1, final Set<T> set2){
		if(set1 == null || set2 == null) return Collections.emptySet();
		Set<Object> res = new LinkedHashSet<>(set1);
		res.retainAll(set2);
		return res;
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<>();
		int n = randInt(10);
		for(int i = 0; i < n; ++i)
			set1.add(randLettersStringTitleCase());
		//////////////////////////////////
		Set<int[]> set2 = new HashSet<>();
		n = randInt(10);
		for(int i = 0; i < n; ++i) {
			int[] arr = new int[randInt(6)];
			for(int j = 0; j < arr.length; ++j)
				arr[j] = randInt(9);
			set2.add(arr);
		}
		System.out.println(union(set1, set2));
		//////////////////////////////////
		Set<String> set3 = new HashSet<String>();
		n = randInt(10);
		for(int i = 0; i < n; ++i)
			set3.add(randLettersStringTitleCase());
		System.out.println(intersect(set1, set3));
	}
	////////////////////////////////////////////////////////////////////////////
}