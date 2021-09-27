package hw05ConditonalStatements;

public enum Days {
	MONDAY("Monday", "��������", "Montag"),
	TUESDAY("Tuesday", "³������", "Dienstag"),
	WEDNESDAY("Wednesday", "������", "Mittwoch"),
	THURSDAY("Thursday", "������", "Donnerstag"),
	FRIDAY("Friday", "�'������", "Freitag"),
	SATURDAY("Saturday", "������", "Samstag"),
	SUNDAY("Sunday", "�����", "Sonntag");

	String eu;
	String ua;
	String de;

	private Days(String eu, String ua, String de) {
		this.eu = eu;
		this.ua = ua;
		this.de = de;
	}
	
	public  String getEU() {
		return eu;
	}
	
	public  String getUA() {
		return ua;
	}
	
	public  String getDE() {
		return de;
	}
}
