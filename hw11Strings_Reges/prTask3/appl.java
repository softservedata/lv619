package hw11Strings_Reges.prTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class appl {
	
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\w{3,15}");
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Input username");
			String s = sc.nextLine();
			Matcher m = p.matcher(s);
			if (m.matches()) {
				list.add(s);
				System.out.println("\tValid username");
				
			}
			else {
				System.out.println("\tInalid username");
			}
			
		}
		
		
		System.out.println("Valid usernames:");
		for(String current: list) {
			System.out.println("\t" + current);
		}
		
	}

}
