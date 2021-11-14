package __myLib;

public final class ConsoleInputReader {
	////////////////////////////////////////////////////////////////////////////
	private static String input;
	private static final java.util.Scanner in = new java.util.Scanner(System.in);
	private static final ConsoleInputReader instance = new ConsoleInputReader();
	////////////////////////////////////////////////////////////////////////////
	public static int getCorrectIntValue() {
		instance.setCorrectInputData(MyString.REGEX.NUMBER);
		try { return Integer.parseInt((input = input.trim()).substring(0, input.indexOf('.'))); 
		} catch	(IndexOutOfBoundsException e) {}
		return Integer.parseInt(input);
	}
	////////////////////////////////////////////////////////////////////////////
	public static String getCorrectFirstName() {
		instance.setCorrectInputData(MyString.REGEX.FIRST_NAME);
		return (char)((input = input.trim()).charAt(0) - 32) + input.substring(1).toLowerCase();
	}
	////////////////////////////////////////////////////////////////////////////
	public static String getCorrectLastName() {
		instance.setCorrectInputData(MyString.REGEX.LAST_NAME);
			String[] tmp = ((char)((input = input.trim()).charAt(0) - 32) + input.substring(1).toLowerCase()).split(" *- *");
		return  tmp.length == 1 ? tmp[0] : tmp[0] + '-' + (char)((tmp[1]).charAt(0) - 32) + tmp[1].substring(1);
	} 
	////////////////////////////////////////////////////////////////////////////
	public static String getCorrectStateNameLC() {
		instance.setCorrectInputData(MyString.REGEX.STATE_NAME);
		return MyString.trimForEachWordInName(input).toLowerCase();
	}
	////////////////////////////////////////////////////////////////////////////
	private void setCorrectInputData(final String regex) {
		while(!(input = in.nextLine()).matches(regex))
			System.out.print("invalid input data. please retry\n:");
	}
	////////////////////////////////////////////////////////////////////////////
}