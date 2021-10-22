package hw10Collections.hw02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Appl {
	
	public static void main(String[] args) {
		
		Map<String, String> personMap = new HashMap<>();
		
		personMap.put("Ivanov", "Ivan");
		personMap.put("Petrov", "Petro");
		personMap.put("Pavlov", "Pavlo");
		personMap.put("Vetoshko", "Orest");
		personMap.put("Grab", "Pavlo");
		personMap.put("Moshenskyi", "Nazar");
		personMap.put("Mudra", "Olena");
		personMap.put("Makar", "Vasyl");
		personMap.put("Dudar", "Oksana");
		personMap.put("Melnyk", "Sofiia");
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
				
				if(entry.getValue().equals(entry1.getValue()) && (!entry.getKey().equals(entry1.getKey()))) {
					System.out.println("\tMatch detectet");
				}
				
			}
		}
		
		
		Iterator<String> iterator = personMap.values().iterator();
		while(iterator.hasNext()) {
			if(iterator.next().contains("Pavlo")) {
				iterator.remove();
			}
			
		}
		System.out.println("After deletion of elements: ");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("\t" + entry.getKey() + " " + entry.getValue());
		}
		
		
		
	}

}
