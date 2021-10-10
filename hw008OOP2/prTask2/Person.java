package hw008OOP2.prTask2;

public abstract class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected abstract void print();


}
