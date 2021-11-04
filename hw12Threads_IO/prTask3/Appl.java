package hw12Threads_IO.prTask3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Appl {
	
	public static void main(String[] args) {
		
		String filename = "F:/mytext.txt";
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bf = null;
		
		
		try {
			String text = "";
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			
			
			//main minus of the program in the next line
			
			String[] strings = new String[1000];
			
			for(int j = 0; j < strings.length; j++) {
				strings[j] = "";
			}
			
			int i = 0;
			while ((text = br.readLine()) != null) {
				strings[i] = text;
				i++;
			}
			br.close();
			
			
			/*-
			for (int j = 0; j < strings.length; j++) {
				if(!(strings[i].isEmpty())) {
					System.out.println(strings[j]);
				}
			}
			*/
			
			
			
			
			int[] numberOfSymbols = new int[strings.length];
			for(int j = 0; j < strings.length; j++) {
				if(!(strings[j].isEmpty())) {
					numberOfSymbols[j] = strings[j].length();
				}
			}
			
			String longest = "text";
			
			for (int j = 0; j < strings.length; j++) {
				if(longest.length() < strings[j].length()) {
					longest = strings[j];
				}
			}
			
			String shortest = longest;
			for (int j = 0; j < strings.length; j++) {
				if((shortest.length() > strings[j].length()) && !(strings[j].isEmpty())) {
					shortest = strings[j];
				}
			}
			
			
			
			
			fw = new FileWriter(filename);
			bf = new BufferedWriter(fw);
			bf.write(Arrays.toString(numberOfSymbols) + "\n" + "longest string: " + longest + "\n" + "shortest string: " + shortest);
			
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
