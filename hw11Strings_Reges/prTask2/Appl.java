package hw11Strings_Reges.prTask2;

import java.util.Scanner;

public class Appl {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your name: ");
		String surname = sc.nextLine();
		System.out.println("Enter your name: ");
		String patronim = sc.nextLine();
		
		System.out.println(surname + " " +  name.charAt(0) + "." + patronim.charAt(0) + ".");
		System.out.println("name: " + name);
		System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1) + " " + patronim.substring(0, 1).toUpperCase() + patronim.substring(1).toLowerCase() + " " + surname.substring(0, 1) + surname.substring(1).toLowerCase());
		
	}

}
