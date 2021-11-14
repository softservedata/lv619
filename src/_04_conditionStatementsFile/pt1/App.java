package _04_conditionStatementsFile.pt1;
import static __myLib.ConsoleInputReader.getCorrectIntValue;

public class App {
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int count = 0;
		System.out.print("enter 3 numbers\n:");
		for(int i = 0; i < 3; ++i)
			if(Math.abs(getCorrectIntValue() % 2) == 1)
				++count;
		System.out.println("number of odd numbers is: " + count);
	}
	////////////////////////////////////////////////////////////////////////////
}