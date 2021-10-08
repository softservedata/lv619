package hw07OOP.task1;

public class Appl {
	
	public static void main(String[] args) {
		Car[] cars = new Car[4];
		cars[0] = new Sedan("Sedan", 200, 2015);
		cars[1] = new Sedan("Truck", 90, 2021);
		cars[2] = new Sedan("Sedan", 200, 2017);
		cars[3] = new Sedan("Truck", 100, 2020);
		
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
