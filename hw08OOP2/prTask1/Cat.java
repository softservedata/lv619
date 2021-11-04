package hw08OOP2.prTask1;

public class Cat implements Animal{
	
	String name;
	int age;

	@Override
	public String voice() {
		return "mew";
	}
	@Override
	public String feed() {
		return "Cat feed";
	}
}
