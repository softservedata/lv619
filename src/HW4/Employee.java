package HW4;

import javax.swing.text.ChangedCharSetException;

public class Employee {

	private String name;
	private double rate;
	private double hours;
	static double totalSum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public static double getTotalSum() {
		return totalSum;
	}

	public static void setTotalSum(double totalSum) {
		Employee.totalSum = totalSum;
	}

	public Employee() {
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public double getSalary() {
		return rate * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	public void changeRate(double rate) {
		return getSalary() + getBonuses();

	}

	public double getBonuses() {
		return getSalary() * 0.1;
	}

}
