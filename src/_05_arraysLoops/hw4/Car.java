package _05_arraysLoops.hw4;

public class Car {
	////////////////////////////////////////////////////////////////////////////
	private char type;
	private int productionYear;
	private int engineCpacity;
	////////////////////////////////////////////////////////////////////////////
	public Car(char type, int productionYear, int engineCpacity) {
		this.type = type;
		this.productionYear = productionYear;
		this.engineCpacity = engineCpacity;
	} public Car() {}
	////////////////////////////////////////////////////////////////////////////
	public char getType() {return type;}
	public int getProductionYear() {return productionYear;}
	public int getEngineCpacity() {return engineCpacity;}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + type;
		result = prime * result + productionYear;
		result = prime * result + engineCpacity;
		return result;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car other = (Car) o;
		return type == other.type && productionYear == other.productionYear &&
				engineCpacity == other.engineCpacity;
	}
	////////////////////////////////////////////////////////////////////////////	
	@Override
	public String toString() {
	return "type: " + type + "\tproduction year: " + productionYear +
			"\tengine capacity: " + engineCpacity;	
	}
	////////////////////////////////////////////////////////////////////////////
}
