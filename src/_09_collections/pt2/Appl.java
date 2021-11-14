package _09_collections.pt2;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import static __myLib.ConsoleInputReader.getCorrectIntValue;
import static __myLib.ConsoleInputReader.getCorrectLastName;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	In the main() method declare map employeeMap of pairs <Integer, String>.
	//	Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
	//	Ask user to enter ID, then find and write corresponding name from your map.
	//	If you can't find this ID - say about it to user (use function containsKey()).
	//	Ask user to enter name, verify than you have name in your map and write corresponding ID.
	//	If you can't find this name - say about it to user (use function containsValue()). 
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>(7);
		int id;
		String lastName;
		for(int i = 1; i < 8; ++i)
			employeeMap.put(i, randLettersStringTitleCase());
		//employeeMap.put(7, employeeMap.get(1));
		for(Entry<Integer, String> entry: employeeMap.entrySet())
			System.out.println("id: " + entry.getKey() + "\tlast name: " + entry.getValue());
		//////////////////////////////////	
		System.out.print("enter id\n:");
		if(employeeMap.containsKey(id = getCorrectIntValue()))
			System.out.println("last name: " + employeeMap.get(id));
		else
			System.out.println("id wasn't found");
		//////////////////////////////////
		System.out.print("enter last name\n:");
		if(employeeMap.containsValue(lastName = getCorrectLastName())) {
			for(Entry<Integer, String> entry: employeeMap.entrySet())
				if(entry.getValue().hashCode() == lastName.hashCode()
				&& entry.getValue().equals(lastName))
					System.out.println("id: " + entry.getKey());
		} else
			System.out.println("last name wasn't found");
	}
	////////////////////////////////////////////////////////////////////////////
}