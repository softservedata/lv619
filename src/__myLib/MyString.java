package __myLib;

public final class MyString {
	////////////////////////////////////////////////////////////////////////////
	public static final class REGEX {
		public static final String NUMBER = "^ *[-+]?\\d+(?:\\.\\d+)? *$";
		public static final String FIRST_NAME = "^ *[a-zA-Z]+ *$";
		public static final String LAST_NAME = "^ *[a-zA-Z]+(?: *- *[a-zA-Z]+)? *$";
		public static final String STATE_NAME = "(?i)^ *(?:[a-z]{2,}\\b *)+(?:- *[a-z]{2,}(?: +[a-z]{2,})* *)?$";
		public static final String US_CURRENCY = "\\$[1-9][0-9]{0,2}(?:([,'` ]?)[0-9]{3})?(?:\\1[0-9]{3})*(?:\\.[0-9]{2})?";
		public static final String DATE = "\\b(?:(?:(?:0?[1-9]|(?:1|2)[0-9]|3(?:0|1))([-.,/])(?:0?[1-9]|1[0-2])\\1[1-9]+[0-9]{0,3})|(?:[1-9]+[0-9]{0,3}([-.,/])(?:0?[1-9]|1[0-2])\\2(?:0?[1-9]|(?:1|2)?[0-9]|3(?:0|1))))\\b";
	}
	////////////////////////////////////////////////////////////////////////////
	public static String toTitleCase(final String str) {
		StringBuilder sb = new StringBuilder();
		java.util.regex.Matcher m = java.util.regex.Pattern.compile(
				"(?:(?!\\b(of|and|the)\\b)\\b[a-z]+\\b)|\\1(?=-|$)|(?<=-|^)\\1")
				.matcher(str.toLowerCase());
		while (m.find())
			m.appendReplacement(sb, (char)(m.group().charAt(0) - 32) + m.group().substring(1));
		return m.appendTail(sb).toString();
	}
	////////////////////////////////////////////////////////////////////////////
	public static String trimForEachWordInName(final String name) {
		return String.join("-", name.trim().split(" *- *")).replaceAll("  +", " ");
	}
	////////////////////////////////////////////////////////////////////////////
	public static String getDate_DDMMYY_format(final String date) {
		if(!date.matches(REGEX.DATE))
			return null;
		char delimiter = 0;
		for(char c: date.toCharArray())
			if(!Character.isDigit(c)) {
				delimiter = c;
				break;
			}
		int d = Integer.parseInt(date.substring(0, date.indexOf(delimiter)));
		int m = Integer.parseInt(date.substring(date.indexOf(delimiter) + 1, date.lastIndexOf(delimiter)));
		int y = Integer.parseInt(date.substring(date.lastIndexOf(delimiter) + 1));
		if(new java.util.GregorianCalendar(y, m - 1, 1).getActualMaximum(java.util.Calendar.DAY_OF_MONTH) < d)
			if(new java.util.GregorianCalendar(d, m - 1, 1).getActualMaximum(java.util.Calendar.DAY_OF_MONTH) < y)
				return null;
			else d = (y + d) - (y = d);
		return new StringBuilder(String.valueOf(100 + d).substring(1) + '.').append(String.valueOf(100 + m).substring(1) + '.').append(y).toString();
	}
	////////////////////////////////////////////////////////////////////////////
}