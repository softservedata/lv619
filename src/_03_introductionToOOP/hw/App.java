package _03_introductionToOOP.hw;
import java.util.Calendar;
import java.util.Scanner;

public class App {
	////////////////////////////////////////////////////////////////////////////
	final static int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	private static final Scanner in = new Scanner(System.in);
	////////////////////////////////////////////////////////////////////////////
	static String randName() {
		StringBuilder sb = new StringBuilder(Character.toString(
						(char)((int)(Math.random() * 26) + 65)));
		for(int i = 0, n = (int)(Math.random() * 10) + 1; i < n; ++i)
			sb.append((char)((int)(Math.random() * 26) + 97)); 
	return sb.toString();
	}
	////////////////////////////////////////////////////////////////////////////
	private static String getCorrectInputData(final String requiredData) {
		System.out.print("enter " + requiredData + ":");
		String input = "";
		do {
				for(char ch: (input = (requiredData.contains("name") && 
						(input = in.nextLine()).length() > 1 ||
						requiredData.contains("year") &&
						(input = in.nextLine()).length() == 4 ? input : ""))
						.toCharArray())
				if(requiredData.contains("name") ?
						!Character.isLetter(ch) : !Character.isDigit(ch)) {
					input = "";
					break;
				}
				if(!input.isEmpty() && !requiredData.contains("name") &&
					(Integer.parseInt(input) < 1900 || 
					Integer.parseInt(input) > CURRENT_YEAR))
				input = "";
				if(input.isEmpty())
					System.out.print("invalid input data. please retry: ");
		} while(input.isEmpty());
		return requiredData.contains("name") ? 
				input.substring(0, 1).toUpperCase() + 
				input.substring(1).toLowerCase() : input;
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		persons[0] = new Person();
		persons[0].input(getCorrectInputData("first name"),
				getCorrectInputData("last name"),
				Integer.parseInt(getCorrectInputData("birth year")));
		in.close();
		for(int i = 1; i < persons.length; ++i) {
			persons[i] = new Person();
			persons[i].input(randName(), randName(), (int)(Math.random() * 122) + 1900);
		}	
		for(int i = 0; i < persons.length; ++i)
			System.out.println(
					"\t\t\t\t\t     Person " + (i + 1) +
					":\n" + persons[i].output());
	}
	////////////////////////////////////////////////////////////////////////////
}