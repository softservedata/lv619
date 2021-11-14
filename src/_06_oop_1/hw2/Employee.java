package _06_oop_1.hw2;

	class Employee {
	////////////////////////////////////////////////////////////////////////////
	private String name;
	private int age;
	private double salary;
	////////////////////////////////////////////////////////////////////////////
	Employee(String name, int age, double salary){
			this.name = name;
			this.age = age;
			this.salary = salary; 
	}
	////////////////////////////////////////////////////////////////////////////
	String report() {return toString();}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public String toString() {
		return "Employee name: " + name + ", age: " + age + ", salary: " + salary; 
	}
	////////////////////////////////////////////////////////////////////////////
}