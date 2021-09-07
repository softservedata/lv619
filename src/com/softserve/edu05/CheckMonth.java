package com.softserve.edu05;

public class CheckMonth {
	private int numberOfMonth;
	
	public CheckMonth(int numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
	}
	
	public int getNumberOfMonth() {
		return numberOfMonth;
	}
	
	public int  check() {
		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		switch(numberOfMonth) {
		case 1:
			return daysOfMonth[0];
		case 2:
			return daysOfMonth[1];
		case 3:
			return daysOfMonth[2];
		case 4:
			return daysOfMonth[3];
		case 5:
			return daysOfMonth[4];
		case 6:
			return daysOfMonth[5];
		case 7:
			return daysOfMonth[6];
		case 8:
			return daysOfMonth[7];
		case 9:
			return daysOfMonth[8];
		case 10:
			return daysOfMonth[9];
		case 11:
			return daysOfMonth[10];
		case 12:
			return daysOfMonth[11];
		default:
			return 0;
		}
	}
}
