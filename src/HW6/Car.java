package HW6;

import java.util.Scanner;

public class Car {

	int year_of_production;
	double engine_capacity;
	String type;

	public int getYearOfProduction() {
		return year_of_production;
	}

	public Car() {
	}

	public Car(String type, int year, double capacity) {
		this.type = type;
		this.year_of_production = year;
		this.engine_capacity = capacity;
	}

	@Override
	public String toString() {
		return "Type = " + type + ", year of production = " + year_of_production + ", engine_capacity = "
				+ engine_capacity;
	}

	public static void main(String[] args) {

		Car[] cars = new Car[4];
		cars[0] = new Car("Lada", 2009, 1.6);
		cars[1] = new Car("Ford", 2010, 2.0);
		cars[2] = new Car("Volvo", 2002, 1.8);
		cars[3] = new Car("Mersedes", 2020, 2.5);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of car:");
		int modelyear = sc.nextInt();

		System.out.println("Current modelyear cars: ");

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getYearOfProduction() == modelyear) {
				System.out.println(cars[i]);
			}
		}

		Car buf = new Car();

		for (int k = 0; k < cars.length; k++) {
			for (int h = 0; h < cars.length; h++) {
				if (cars[k].getYearOfProduction() < cars[h].getYearOfProduction()) {
					buf = cars[k];
					cars[k] = cars[h];
					cars[h] = buf;
				}
			}
		}

		System.out.println("Sorted by year of production:");

		for (int d = 0; d < cars.length; d++) {
			System.out.println(cars[d]);
		}
	}

}
