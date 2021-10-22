package hw10Collections.prTask2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	/*-
	In the main() method declare map employeeMap of pairs <Integer, String>.
	Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
	Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID - say about it to user (use function containsKey()).
	Ask user to enter name, verify than you have name in your map and write corresponding ID. If you can't find this name - say about it to user (use function containsValue()). 
	*/
	
	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap = new HashMap<>();
		
		employeeMap.put(1, "Ivan");
		employeeMap.put(2, "Roman");
		employeeMap.put(3, "Pavlo");
		employeeMap.put(4, "Stepan");
		employeeMap.put(5, "Petro");
		employeeMap.put(6, "Yaroslav");
		employeeMap.put(7, "Sviatoslav");
		
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println("User id: " + entry.getKey() + ", username: " + entry.getValue());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String name = sc.nextLine();
		
		if (employeeMap.containsValue(name)) {
			for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println("Current user id: " + entry.getKey());
				}
			}
			
		}
		else {
			System.out.println("User with such name was not found!");
		}
		
		
		
	
		System.out.println("Enter user id: ");
		int id = sc.nextInt();
		
		
		if (employeeMap.containsKey(id)) {
			System.out.println("Current username: " + employeeMap.get(id));
		}
		else {
			System.out.println("User with such id was not found!");
		}
		
		
	}

}
