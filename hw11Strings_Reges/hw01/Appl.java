package hw11Strings_Reges.hw01;

import java.util.Scanner;

public class Appl {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Iprut sentnce of 5 words");
		String sent = sc.nextLine();
		
		String[] strings = sent.split(" ");
		/*-
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		*/
		
		String longest = "";
		
		int i = 0;
		while(i< strings.length) {
			if(strings[i].length() > longest.length()) {
				longest = strings[i];
			}
			i++;
		}
		
		
		String sent2 = sent.replace(" ", "");
		
		System.out.println(longest);
		System.out.println("number of letters in the sencence: " + sent2.length());
		System.out.println("second word in reverse order:" +  new StringBuilder(strings[1]).reverse());
		
	}

}
