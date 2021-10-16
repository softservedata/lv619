package hw09Nested_Inner_Classes.prTask1;

public interface ICarBuilder {
	
	public ICarBuilder setColor(String color);
	public ICarBuilder setPassangerCapacity(int passangerCapacity);
	public ICarBuilder setIsAirConditioning(boolean isAirConditioning);
	public CarBuilder build();

}
