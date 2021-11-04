package hw12Threads_IO.hw04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Appl {
	
	public static void main(String[] args) throws IOException {
		
		String forReading = "F:/file1.txt";
		String forWriting = "F:/file2.txt";
		
		
		File fr = new File(forReading);
		
		
		BufferedReader br = new BufferedReader(new FileReader(fr));
		
		String[] rows = new String[(int)br.lines().count()];
		
		//should construct new BufferedReader after using "br.lines()" command
		//br.reset() doesn't work(Runtime exception ocured)
		BufferedReader br1 = new BufferedReader(new FileReader(fr));
		
		for(int i = 0; i < rows.length; i++) {
			rows[i] = br1.readLine();
		}
		
		br.close();
		br1.close();
		
		
		////////checkblock for knowing of success reading from file
		System.out.println(rows.length);
		
		
		for(int i = 0; i < rows.length; i++) {
			System.out.println(rows[i]);
		}
		
		////
		
		String longest = "";
		
		for (int i = 0; i < rows.length; i++) {
			if(rows[i] != null && longest.length() < rows[i].length()) {
				longest = rows[i];
			}
		}
		
		
		String dateOfBirth = "was not found";
		
		for (int i = 0; i < rows.length; i++) {
			if (rows[i] != null && rows[i].contains("birth")) {
				dateOfBirth = rows[i];
			}
		}
		
		String name = "was not found";
		
		for (int i = 0; i < rows.length; i++) {
			if (rows[i] != null && rows[i].contains("name")) {
				name = rows[i];
			}
		}
		
		
		
		FileWriter fw = new FileWriter(forWriting);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("number of lines: " + rows.length + "\nLongest line :" + longest + "\n" + name + "\n" + dateOfBirth);
		
		bw.close();
	
	
	}
	

}
