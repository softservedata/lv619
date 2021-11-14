package __myLib;

import java.util.Random;

public class Rand {
	////////////////////////////////////////////////////////////////////////////
	private static final Random  random = new Random();
	////////////////////////////////////////////////////////////////////////////
	public static int randInt(int fromTo, int toFrom) {
		return fromTo < toFrom ? random.nextInt(toFrom - fromTo + 1) + fromTo : random.nextInt(fromTo - toFrom + 1) + toFrom;         
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public static int randInt(int toFrom) {
		return toFrom < 0 ? random.nextInt(-toFrom + 1) + toFrom : random.nextInt(toFrom + 1);
	}
	////////////////////////////////////////////////////////////////////////////
	public static String randLettersStringTitleCase() {
		StringBuilder sb = new StringBuilder(Character.toString((char)randInt(65, 90)));
		for(int i = 0, n = randInt(2, 12); i < n; ++i)
			sb.append((char)randInt(97, 122)); 
	return sb.toString();
	}
	////////////////////////////////////////////////////////////////////////////
	public static String randDateStr(int minYear, int maxYear) {
		String y = String.valueOf(randInt(minYear, maxYear));
		String m = String.valueOf(randInt(1, 12));
		String d = String.valueOf(randInt(1, new java.util.GregorianCalendar(Integer.parseInt(y), Integer.parseInt(m) ,0).getActualMaximum(java.util.Calendar.DAY_OF_MONTH)));
		if(randInt(1) == 0) {
		m = m.length() == 1 ? '0' + m : m;
		d = d.length() == 1 ? '0' + d : d;
		}		
		char delimiter = '.';
		switch (randInt(3)) { 
		case 1: delimiter = ','; break;
		case 2: delimiter = '-'; break;
		case 3: delimiter = '/'; break;
		}
		if(randInt(1) == 0)
			return new StringBuilder(d + delimiter).append(m + delimiter).append(y).toString();
		else
			return new StringBuilder(y + delimiter).append(m + delimiter).append(d).toString();
	}
	////////////////////////////////////////////////////////////////////////////
	public static String randColorStr() {
		return new String[]{"black", "red", "orange", "yellow", "green", "blue", "indigo", "violet", "white"}[randInt(8)];
	}
	////////////////////////////////////////////////////////////////////////////
}