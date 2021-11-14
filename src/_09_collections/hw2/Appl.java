package _09_collections.hw2;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import static __myLib.Rand.randLettersStringTitleCase;

import java.util.Iterator;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create map personMap and
	//	add to it ten persons of type <String, String> (lastName, firstName).
	//	Output the entities of the map on the screen. 
	//	There are at less two persons with the same firstName among these 10 people?
	//	Remove from the map person whose firstName is ”Orest” (or other). Print result.  
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		while(map.size() != 8)
			map.putIfAbsent(randLettersStringTitleCase(), randLettersStringTitleCase());
		while(map.size() != 10)
			map.putIfAbsent(randLettersStringTitleCase(), "Orest");
		System.out.println("\t\t\t\torigin:");
		for(Entry<String, String> entry: map.entrySet())
			System.out.println("first name: " + entry.getValue() +
					"\tlast name: " + entry.getKey());
		//////////////////////////////////
		for(Iterator<String> i = map.values().iterator(); i.hasNext();)
			if(i.next().equals("Orest"))
				i.remove();
		System.out.println("\n\t\t\t\tupdated:");
		for(Entry<String, String> entry: map.entrySet())
			System.out.println("first name: " + entry.getValue() +
					"\tlast name: " + entry.getKey());
	}
	////////////////////////////////////////////////////////////////////////////
}