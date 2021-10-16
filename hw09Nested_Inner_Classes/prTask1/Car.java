package hw09Nested_Inner_Classes.prTask1;

public class Car implements CarBuilder, ICarBuilder, IDateOfProduction, IengineCapacity, IModel {
	
	private String model;
	private String DateOfProduction;
	private double engineCapacity;
	private String color;
	private int passangerCapacity;
	private boolean isAirConditioning;
	
	private Car() {
		this.color = "";
		this.passangerCapacity = 0;
		this.isAirConditioning = false;
	}
	
	//Static factory
	
	public static IModel get() {
		return new Car();
	}
	
	
	//Setters
	public IDateOfProduction setModel(String model) {
		this.model = model;
		return this;
	}
	
	public IengineCapacity setIDateOfProduction (String dateOfProduction) {
		this.DateOfProduction = dateOfProduction;
		return this;
	}
	
	public ICarBuilder setEngineCapacity (double engineCapacity) {
		this.engineCapacity = engineCapacity;
		return this;
	}
	
	//optional setters
	public ICarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	public ICarBuilder setPassangerCapacity(int passangerCapacity) {
		this.passangerCapacity = passangerCapacity;
		return this;
	}
	
	
	public ICarBuilder setIsAirConditioning(boolean isAirConditioning) {
		this.isAirConditioning = isAirConditioning;
		return this;
	}
	
	
	//final method
	public CarBuilder build() {
		return this;
	}
	
	
	
	
	//getters
	
	public String getModel() {
		return this.model;
	}
	
	
	public String getDateOfProduction() {
		return this.DateOfProduction;
	}
	
	
	
	public double getEngineCapacity() {
		return this.engineCapacity;
	}
	
	
	
	public String getColor() {
		return this.color;
	}
	
	
	
	public int getPassangerCapacity() {
		return this.passangerCapacity;
	}
	
	
	
	public boolean getisAirConditioning() {
		return this.isAirConditioning;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", DateOfProduction=" + DateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passangerCapacity=" + passangerCapacity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}
	
	

}
