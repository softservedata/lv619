package hw09Nested_Inner_Classes.prTask1;

public class Appl {
	
	public static void main(String[] args) {
		
		CarBuilder car = Car.get()
				.setModel("BMW")
				.setIDateOfProduction("2008")
				.setEngineCapacity(3.5)
				.setColor("Black")  //optional
				.setIsAirConditioning(true)  //optional
				.setPassangerCapacity(5)  //optional
				.build();
	
		System.out.println(car);
	
	
	}
	
	

}
