package hw008OOP2.hw01;

public class SalariedEmployee extends Employee{
	
	private int socialSecurityNumber;
	private double rate;
	private int hours;
	
	public SalariedEmployee(String name, int id, int socialSecurityNumber, double rate, int h) {
		super(name, id);
		this.socialSecurityNumber = socialSecurityNumber;
		this.rate = rate;
		this.hours = h;
	}
	
	
	public double getRate() {
		return this.rate;
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public double calculatePay() {
		return getRate() * getHours();
	}
	

}
