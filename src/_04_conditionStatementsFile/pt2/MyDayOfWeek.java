package _04_conditionStatementsFile.pt2;
import java.time.DayOfWeek;

enum MyDayOfWeek {
	////////////////////////////////////////////////////////////////////////////
	MONDAY("Понедельник", "Понеділок"),
	TUESDAY("Вторник", "Вівторок"),
	WEDNESDAY("Среда", "Середа"),
	THURSDAY("Четверг", "Четвер"),
	FRIDAY("Пятница", "П'ятниця"),
	SATURDAY("Суббота", "Субота"),
	SUNDAY("Воскресение", "Неділя");
	////////////////////////////////////////////////////////////////////////////
	private String en_US;
	private String ru_RU;
	private String uk_UA;
	////////////////////////////////////////////////////////////////////////////
	MyDayOfWeek(String ru_RU, String uk_UA) {
		en_US = DayOfWeek.of(this.ordinal() + 1).name();
		en_US = en_US.charAt(0) + en_US.substring(1).toLowerCase();
		this.ru_RU = ru_RU;
		this.uk_UA = uk_UA;
	}
	////////////////////////////////////////////////////////////////////////////
	String get_en_US() {return en_US;}
	String get_ru_RU() {return ru_RU;}
	String get_uk_UA() {return uk_UA;}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return new StringBuilder("English:\t").append(get_en_US()).
				append("\nRussian:\t").append(get_ru_RU()).
				append("\nUkrainian:\t").append(get_uk_UA()).toString();
	}
	////////////////////////////////////////////////////////////////////////////1
}