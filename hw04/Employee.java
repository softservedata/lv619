package hw04;

public class Employee {
	private String name;
	private double hours;
	private double rate;
	private static double totalSum;
	private double Salary;
	
	public Employee () {
		getSalary();
		totalSum +=(getBonuses() + getSalary());
	}
	
	public Employee (String name, double rate) {
		this.name = name;
		this.rate = rate;
		getSalary();
		totalSum +=(getBonuses() + getSalary());
	}
	
	public Employee (String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		getSalary();
		totalSum +=(getBonuses() + getSalary()); 
	}
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setHours (double hours) {
		this.hours = hours;
	}
	
	public void setName (double rate) {
		this.rate = rate;
	}
	
	public String getName () {
		return this.name;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public double getHours() {
		return this.hours;
	}
	
	public double getSalary() {
		return Salary = (getHours() * getRate());
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ", rate=" + rate + ", Salary=" + Salary + "]";
	}
	
	public double getBonuses() {
		return getSalary() / 10;
	}
	
	public void changeRate (double aRate) {
		totalSum -= (getBonuses() + getSalary());
		this.rate = aRate;
		totalSum += (getBonuses() + getSalary());
		
		
		
	}
	
	public static void main (String[] args) {
		Employee empl1 = new Employee ("Igor", 5, 10);
		Employee empl2 = new Employee ("Volodymyr", 6, 8);
		Employee empl3 = new Employee ("Ivan", 7, 6);
		
		System.out.println(empl1);
		empl2.changeRate(12);
		System.out.println(empl2);
		System.out.println(empl3);
		System.out.println("totalSum = " + totalSum );
		 
	}
	
}

