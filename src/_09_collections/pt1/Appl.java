package _09_collections.pt1;
import java.util.List;
import java.util.LinkedList;

import static __myLib.Rand.randInt;

import java.util.Comparator;
import java.util.Iterator;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Declare collection myCollection of 10 integers and fill it (from the console or random).
	//	Find and save in list newCollection all positions of element more than 5 in the collection.
	//	Print newCollection
	//	Remove from collection myCollection elements, which are greater then 20. Print result
	//	Insert elements 1, -3, -4 in positions 2, 8, 5.
	//	Print result in the format: “position – xxx, value of element – xxx”
	//	Sort and print collection
	//	Use one or more of the next Collections: List, ArrayList, LinkedList
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		List<Integer> myCollection = new LinkedList<Integer>();
		while(myCollection.size() != 10)
			myCollection.add(randInt(-99, 99));
		System.out.print("myCollection: " + myCollection.toString().substring(
				1, myCollection.toString().length() - 1));
		//////////////////////////////////
		{	List<Integer> newCollection = new LinkedList<>();
			for(int el: myCollection)
				if(el > 5)
					newCollection.add(el);
			System.out.print("\nnewCollection: " + newCollection.toString().substring(
					1, newCollection.toString().length() - 1));		}
		//////////////////////////////////
		for(Iterator<Integer> i = myCollection.iterator(); i.hasNext();)
			if(i.next() > 20)
				i.remove();
		System.out.print("\nmyCollection updated: " +
				myCollection.toString().substring(1, myCollection.toString().length() - 1));
		//////////////////////////////////
		if(myCollection.size() >=  2) myCollection.add(2, 1);
		if(myCollection.size() >=  8) myCollection.add(8, -3);
		if(myCollection.size() >=  5) myCollection.add(5, -4);
		System.out.println("\nmyCollection updated:");
		for(int i = 0; i < myCollection.size(); ++i)
			System.out.println("position – " + i + ", value of element - " + myCollection.get(i));
		//////////////////////////////////
		myCollection.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {return o1-o2;}});
		System.out.print("myCollection sorted: " +
				myCollection.toString().substring(1, myCollection.toString().length() - 1));
	}
	////////////////////////////////////////////////////////////////////////////
}