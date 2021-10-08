package hw07OOP.hw2;

public class Developer extends Employee {
	
	private String position;
	
	public Developer(String name, int age, double salary, String position) {
		super(name, age, salary);
		this.position = position;
	}
	
	public String getPos() {
		return this.position;
	}
	
	@Override
	public String report() {
		return "Name: " + getName() + ", age: " + getAge() + ", Position: " + getPos() + ", salary : " + getSalary();
	}

}
