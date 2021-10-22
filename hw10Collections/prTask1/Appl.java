package hw10Collections.prTask1;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;


public class Appl {
	private static final Random  random = new Random();
	
	public static void main(String [] args) {
		
		List<Integer> myCollection = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			myCollection.add(i, random.nextInt(50));
		}
		
		System.out.println(myCollection);
		
		
		
		List<Integer> newCollection = new ArrayList<>();
		
		
		
		Iterator<Integer> iterator = myCollection.iterator();
		
		while (iterator.hasNext()) {
			Integer curr = iterator.next();
			if(curr > 5) {
				newCollection.add(curr);
			}
		}
		
		System.out.println(newCollection);
		
		Iterator<Integer> iterator2 = myCollection.iterator();
		while (iterator2.hasNext()) {
			Integer curr = iterator2.next();
			if(curr > 20) {
				iterator2.remove();
			}
		}
		
		System.out.println(myCollection);
		
		if(myCollection.size() >= 2) { myCollection.add(2, 1);}
		if(myCollection.size() >= 8) {myCollection.add(8, -3);}
		if(myCollection.size() >= 5) {myCollection.add(5, -4);}
		for (int j =0; j < myCollection.size(); j++) {
			System.out.println("element " + (j+1) + " = " +  myCollection.get(j));
		}
		
		
		myCollection.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer int1, Integer int2) {
				return int1 - int2;
			}
		});
		
		System.out.println("Sorted " + myCollection);
	}

}
