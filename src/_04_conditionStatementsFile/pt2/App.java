package _04_conditionStatementsFile.pt2;
import static __myLib.ConsoleInputReader.getCorrectIntValue;
	
public class App {
	////////////////////////////////////////////////////////////////////////////
	private static int getCorrectInputData() {
		System.out.print("enter day number:");
		int input;
		while((input = getCorrectIntValue()) < 1 || input > 7)
			System.out.print("invalid input data. please retry: ");
		return input;
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.print(MyDayOfWeek.values()[getCorrectInputData() - 1]);
	}
	////////////////////////////////////////////////////////////////////////////
}