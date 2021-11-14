package _06_oop_1.pt1;

public abstract class Car {
	////////////////////////////////////////////////////////////////////////////
	private String model;
	private int maxSpeed;
	private int yearOfManufacture;
	////////////////////////////////////////////////////////////////////////////
	protected Car(String model, int maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	} protected Car() {}
	////////////////////////////////////////////////////////////////////////////
	public void run() {System.out.println("run");}
	public void stop() {System.out.println("stop");}
	////////////////////////////////////////////////////////////////////////////
	protected String getType() {return model;}
	protected int getEngineCpacity() {return maxSpeed;}
	protected int getProductionYear() {return yearOfManufacture;}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime + (model == null ? 0 : model.hashCode());
		result = prime * result + maxSpeed;
		result = prime * result + yearOfManufacture;
		return result;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car other = (Car) o;
		return model == other.model &&
				maxSpeed == other.maxSpeed &&
				yearOfManufacture == other.yearOfManufacture;
	}
	////////////////////////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "model: " + model + "\tproduction year: " +
	yearOfManufacture + "\tengine capacity: " + maxSpeed;
	}
	////////////////////////////////////////////////////////////////////////////
}