package hw07OOP.task1;

public abstract class Car {
	String model;
	int maxSpeed;
	int yearOfManufacture;
	
	public Car(String mod, int a, int b) {
		this.model = mod;
		this.maxSpeed = a;
		this.yearOfManufacture = b;
	}
	
	abstract void run();
	abstract void stop();
	
	public String toString() {
		return "Type: " + model + ", max speed: " +  maxSpeed + ", year of production: " + yearOfManufacture;
	}
	

}
