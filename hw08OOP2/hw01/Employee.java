package hw08OOP2.hw01;

public abstract class Employee implements Payment{
	
	
	public String name;
	public int employeeID;
	
	public Employee(String name, int id) {
		this.name = name;
		this.employeeID = id;
	}
	
	//public abstract double calculatePay();
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.employeeID;
	}
	
	
	@Override
	public String toString() {
		return "Employee: \tName = " + this.getName() + ", ID : " + this.getID() + ", salary = " + this.calculatePay();
	}

}
