package _12_IO_Thread.hw4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import __myLib.MyString.REGEX;
import static __myLib.MyString.getDate_DDMMYY_format;
import static __myLib.Rand.randDateStr;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create file1.txt file with a text about your career.
	//	Read context from file into array of strings. Each array item contains one line from file.
	//	Write in to the file2.txt
	//	   1) number of lines in file1.txt.
	//	   2) the longest line in file1.txt.
	//	   3) your name and birthday date. 
	////////////////////////////////////////////////////////////////////////////
	static {
		try (FileWriter fWriter = new FileWriter("file1.txt")) {
		StringBuilder buffer = new StringBuilder("   " + randLettersStringTitleCase());
		for(int i = 1, n = randInt(300, 500); i < n; ++i)
				buffer.append((i % 10 == 0 ? '\n' : buffer.toString().endsWith("-") && !buffer.toString().endsWith(" -") ? "" : ' ') + (buffer.substring(buffer.length() - 1).matches("[!?.]") ? i % 10 == 0 && randInt(1) == 0 ? "   " + randLettersStringTitleCase() : randLettersStringTitleCase() : randLettersStringTitleCase().toLowerCase())).append(i == n - 1 ? randInt(1) == 0 ? '.' : randInt(1) == 0 ? '!' : '?' : randInt(6) == 0 ? getRandPunctuation() : "");
		insertRandInfoInBuffer(buffer);
		System.out.println("\t\t\t\t\tfile1.txt:\n" + buffer);
		fWriter.write(buffer.toString());
		} catch (IOException e) {}
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
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static void insertRandInfoInBuffer(final StringBuilder buffer) {
		int n = buffer.length() - 1;
		int tmpIndx;
		int tmp;
		while(buffer.substring((tmp = (tmpIndx = randInt(n)) - 3) > 0 ? tmp : 0, (tmp = tmpIndx + 3) < n ? tmp : n).contains("   ") || buffer.substring((tmp = tmpIndx - 7) > 0 ? tmp : 0, (tmp = tmpIndx + 7) < n ? tmp : n).contains("-"));
		buffer.insert(tmpIndx, (buffer.substring(tmpIndx - 1, tmpIndx).matches("\\n| ") ? "" : " ") + (buffer.substring(tmpIndx - 2, tmpIndx).matches("[a-z][.!?]|[.!?][ \\n]") ?  'N' : 'n') + "ame: " + randLettersStringTitleCase() + (buffer.substring(tmpIndx, tmpIndx + 1).matches("[ .!?,;:\\n]") ? "" : " "));
		n = buffer.length() - 1;
		while(buffer.substring((tmp = (tmpIndx = randInt(n)) - 3) > 0 ? tmp : 0, (tmp = tmpIndx + 3) < n ? tmp : n).contains("   ") || buffer.substring((tmp = tmpIndx - 7) > 0 ? tmp : 0, (tmp = tmpIndx + 7) < n ? tmp : n).contains("-") || buffer.substring((tmp = tmpIndx - 18) > 0 ? tmp : 0, tmpIndx).contains("name: "));
		buffer.insert(tmpIndx, (buffer.substring(tmpIndx - 1, tmpIndx).matches("\\n| ") ? "" : " ") + (buffer.substring(tmpIndx - 2, tmpIndx).matches("[a-z][.!?]|[.!?][ \\n]") ?  'B' : 'b') + "irth day: " + randDateStr(1970, 2003) + (buffer.substring(tmpIndx, tmpIndx + 1).matches("[ .!?,;:\\n]") ? "" : " "));
	}
	////////////////////////////////////////////////////////////////////////////
	private static String[] getStringArrayAndDeleteFILE1_TXT() throws IOException {
		File file1 = new File("file1.txt");
		String[] lines;
		try (BufferedReader tmp = new BufferedReader(new FileReader(file1))){
			lines = new String[(int)tmp.lines().count()];
		}
		try(BufferedReader bReader = new BufferedReader(new FileReader(file1))){
			for(int i = 0; i < lines.length; ++i)
					lines[i] = bReader.readLine();
		}
		file1.delete();
		return lines;
	}
	////////////////////////////////////////////////////////////////////////////
	private static void writeInFILE2_TXT(String[] lines) throws IOException{
		String info = "", longestLine = "";
		String[] regexes = {"(?:\\b[nN]ame: \\b" + REGEX.FIRST_NAME.substring(3, REGEX.FIRST_NAME.length() - 3) + "\\b)", "(?:\\b[bB]irth day: " +  REGEX.DATE + ")"};
		Pattern p = Pattern.compile(String.join("|", regexes));
		Matcher m;
		int i = -1, n = lines.length;
		while(++i < n){
			m = p.matcher(lines[i]);
			if(longestLine.length() < lines[i].length())
				longestLine = lines[i];
			if(m.find()) {
				info = (m.group().matches(regexes[0]) ? "name: " : ", birth date: ") + m.group().substring(m.group().lastIndexOf(' ') + 1); 
				p = Pattern.compile(info.matches(regexes[0]) ? regexes[1] : regexes[0]);
				--i;
				break;
			}
		}
		while(++i < n){
			m = p.matcher(lines[i]);
			if(longestLine.length() < lines[i].length())
				longestLine = lines[i];
			if(m.find()) { 
				info = info.charAt(0) == ',' ? "name: " + m.group().substring(m.group().lastIndexOf(' ') + 1) + info : info + ", birth date: " + m.group().substring(m.group().lastIndexOf(' ') + 1);
				break;
			}
		}
		while(++i < n)
			if(longestLine.length() < lines[i].length())
				longestLine = lines[i];
		try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(new File("file2.txt")))){
			bWriter.write(lines.length + " lines in file1.txt");
			bWriter.newLine();
			bWriter.write("the longest line in file1.txt - \"" + longestLine + "\"");
			bWriter.newLine();
			bWriter.write(info.endsWith("null") ? info.replace("\\bnull$", "date out of calendar") : info.substring(0, info.lastIndexOf(' ') + 1) + getDate_DDMMYY_format(info.substring(info.lastIndexOf(' ') + 1)));
		}
	}
	////////////////////////////////////////////////////////////////////////////
	private static void readAndDeleteFILE2_TXT() throws IOException{
		File file2 = new File("file2.txt");
		try(BufferedReader bReader = new BufferedReader(new FileReader(file2))){
			System.out.println("-".repeat(100) + "\n\t\t\t\t\tfile2.txt:");
			for(String s = bReader.readLine(); s != null; s = bReader.readLine())
					System.out.println(s);
		}
		file2.delete();
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		try {
			writeInFILE2_TXT(getStringArrayAndDeleteFILE1_TXT());
			readAndDeleteFILE2_TXT();
			} catch (IOException e1) {}
	}
	////////////////////////////////////////////////////////////////////////////
}