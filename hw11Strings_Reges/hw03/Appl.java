package hw11Strings_Reges.hw03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//the first symbol "$", then any number of digits, dot and two digits after the dot.

public class Appl {
	
	public static void main(String[] args) {
		
		//Pattern p = Pattern.compile("\\$[0-9]+");
				//+ "\\.?[0-9]{0, 2}");
		
		Pattern p = Pattern.compile("\\$[0-9]+\\.{1}[0-9]{1,2}");
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your string:");
		String text = sc.nextLine();
		
		Matcher m = p.matcher(text);
		
		m.matches();
		
		m.reset();
		
		while(m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}
		
		if (text.equals("irusia su$ka")) {
			System.out.println("You are totally write!!!");
		}
		
	}

}
