package hw05ConditonalStatements;

public enum Days {
	MONDAY("Monday", "Понеділок", "Montag"),
	TUESDAY("Tuesday", "Вівторок", "Dienstag"),
	WEDNESDAY("Wednesday", "Середа", "Mittwoch"),
	THURSDAY("Thursday", "Четвер", "Donnerstag"),
	FRIDAY("Friday", "П'ятниця", "Freitag"),
	SATURDAY("Saturday", "Субота", "Samstag"),
	SUNDAY("Sunday", "Неділя", "Sonntag");

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
