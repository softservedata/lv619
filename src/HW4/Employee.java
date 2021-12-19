package HW4;

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
		totalSum = getSalary() + getBonuses();

	}

	public double getBonuses() {
		return getSalary() * 0.1;
	}

	public static void main(String[] args) {
		Employee em1 = new Employee("Yevhen", 300, 165);
		Employee em2 = new Employee("Dmitriy", 500, 180);
		Employee em3 = new Employee("Maria", 400, 170);
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		em1.changeRate(totalSum);
		System.out.println("Yevhen = " + totalSum);
		em2.changeRate(totalSum);
		System.out.println("Dmitriy = " + totalSum);
		em3.changeRate(totalSum);
		System.out.println("Maria = " + totalSum);
	}

}
