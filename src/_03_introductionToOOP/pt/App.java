package _03_introductionToOOP.pt;
import java.util.Scanner;

class App {
	////////////////////////////////////////////////////////////////////////////
	private static final Scanner in = new Scanner(System.in);
	////////////////////////////////////////////////////////////////////////////
	private static String randName() {
		StringBuilder sb = new StringBuilder(Character.toString(
						(char)((int)(Math.random() * 26) + 65)));
		for(int i = 0, n = (int)(Math.random() * 10) + 1; i < n; ++i)
			sb.append((char)((int)(Math.random() * 26) + 97)); 
	return sb.toString();
	}
	////////////////////////////////////////////////////////////////////////////
	private static String getCorrectInputData(final String requiredData) {
		System.out.print("enter " + requiredData + ":");
		String input;
		do {
				for(char ch: (input = (input = in.nextLine()).length() >
				(requiredData.equals("name") ? 1 : 0) ? input : "")
						.toCharArray())
				if(requiredData.equals("name") ?
						!Character.isLetter(ch) : !Character.isDigit(ch)) {
					input = "";
					break;
				}
				if(!input.isEmpty() && !requiredData.equals("name") &&
					Integer.parseInt(input) < 
					(requiredData.equals("rate") ? 1 : 0))
				input = "";
				if(input.isEmpty())
					System.out.print("invalid input data. please retry: ");
		} while(input.isEmpty());
		return requiredData.equals("name") ? 
				input.substring(0, 1).toUpperCase() + 
				input.substring(1).toLowerCase() : input;
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		employees[0] = new Employee(getCorrectInputData("name"),
				Integer.parseInt(getCorrectInputData("rate")),
				Integer.parseInt(getCorrectInputData("hours")));		
		in.close();
		for(int i = 1; i < employees.length; ++i) {
			employees[i] = new Employee(randName(),
					(int)(Math.random() * 101) + 1,
					(int)(Math.random() * 101));
		}
		for(int i = 0; i < employees.length; ++i)
			System.out.println("Empemployee " + (i + 1) + "\t" + employees[i]);
			System.out.println(
					"\t\t\t\tEmployee salary costs = " + Employee.totalSum);
	}
	////////////////////////////////////////////////////////////////////////////
}