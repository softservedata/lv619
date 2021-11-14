package _04_conditionStatementsFile.pt3;

import static __myLib.ConsoleInputReader.getCorrectStateNameLC;;

public class App {
	public static void main(String[] args) {
		System.out.print("enter state name\n:" + StateLocater.getStateLocation(getCorrectStateNameLC()));
	}
}