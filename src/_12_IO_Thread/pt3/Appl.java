package _12_IO_Thread.pt3;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Prepare mytext.txt file with a lot of text inside.
	//	Read context from file into array of strings.
	//	Each array item contains one line from file.
	//	Complete next tasks:
	//	   1) count and write the number of symbols in every line.
	//	   2) find the longest and the shortest line. 
	//	   3) find and write only that lines, which consist of word �var�	
	////////////////////////////////////////////////////////////////////////////
	static {
		try (FileWriter fWriter = new FileWriter("mytext.txt")) {
		StringBuilder buffer = new StringBuilder(randInt(20) == 0 ? "var" : "   " + randLettersStringTitleCase());
		for(int i = 1, n = randInt(300, 500); i < n; ++i)
			if(i % 10 == 0 && randInt(12) == 0)
				buffer.append("\nvar");
			else 
				buffer.append((i % 10 == 0 || buffer.toString().endsWith("\nvar") || buffer.toString().equals("var") ? '\n' : buffer.toString().endsWith("-") && !buffer.toString().endsWith(" -") ? "" : ' ') + (buffer.substring(buffer.length() - 1).matches("[!?.]") ? i % 10 == 0 && randInt(1) == 0 ? "   " + randLettersStringTitleCase() : randLettersStringTitleCase() : randLettersStringTitleCase().toLowerCase())).append(i == n - 1 ? randInt(1) == 0 ? '.' : randInt(1) == 0 ? '!' : '?' : randInt(6) == 0 ? getRandPunctuation() : "");
		System.out.println("\t\t\t\t\ta lot of text:\n" + buffer.toString());
		fWriter.write(buffer.toString());
		} catch (IOException e) {}
		finally {System.out.println();}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static String getRandPunctuation() {
		switch (randInt(6)) {
		default: return ".";
		case 1: return "!";
		case 2: return "?";
		case 3: return ",";
		case 4: return ";";
		case 5: return "-";
		case 6: return " -";
		}
	}
	////////////////////////////////////////////////////////////////////////////
	private static String[] getStringArrayFromMYTEXT_TXT() throws IOException {
		File file = new File("mytext.txt");
		String[] lines;
		try (BufferedReader tmp = new BufferedReader(new FileReader(file))){
			lines = new String[(int)tmp.lines().count()];
		}
		try(BufferedReader bReader = new BufferedReader(new FileReader(file))){
			for(int i = 0; i < lines.length; ++i)
					lines[i] = bReader.readLine();
		}
		file.delete();
		return lines;
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args){
		String lines[] = null;
		try { lines = getStringArrayFromMYTEXT_TXT(); } catch (IOException e) {}
		Stack<String> varLines = new Stack<>();
		int indexOfLongest = 0, indexOfShortest = 0;
		for(int i = 0; i < lines.length; ++i) {
			System.out.println("number of symbols in line: " + (i + 1) + " = " + lines[i].length());
			if(lines[i].length() > lines[indexOfLongest].length()) indexOfLongest = i;
			if(lines[i].length() < lines[indexOfShortest].length()) indexOfShortest = i;
			if(lines[i].hashCode() == "var".hashCode() && lines[i].equals("var")) varLines.push((i + 1) + ") " + lines[i]);
		}
		System.out.println("line " + (indexOfLongest + 1) + " is longest\nline " + (indexOfShortest + 1) + " is shortest");
		if(!varLines.isEmpty()) {
		System.out.println("\"var\" lines:");
		while(!varLines.isEmpty())
			System.out.println(varLines.pop());
		}
	}
	////////////////////////////////////////////////////////////////////////////
}