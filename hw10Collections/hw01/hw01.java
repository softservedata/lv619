package hw10Collections.hw01;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class hw01 {
	
	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		if(set1.isEmpty() && set2.isEmpty()) {
			return Collections.emptySet();
		}
		
		Set<T> newSet = new HashSet<>(set1);
		newSet.addAll(set2);
		return newSet;
	}
	
	
	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> newSet = new HashSet<>(set1);
		newSet.retainAll(set2);
		return newSet;
	}
	
	public static void main(String[] args) {
		Set<Integer> f = new HashSet<>();
		f.add(2);
		f.add(5);
		f.add(10);
		Set<Integer> s = new HashSet<>();
		s.add(5);
		s.add(7);
		s.add(1);
		System.out.println(union(f, s));
		System.out.println(intersect(f, s));
		
		
	}

}
