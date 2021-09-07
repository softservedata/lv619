package com.softserve.edu05;
import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		Car[] cars = {
				new Car("BMW",300),
				new Car("Mersedes", 500),
				new Car("Audi",350),
				new Car("Huidai",400)
				};
		for(Car current : cars) {
			System.out.println(current);
		}
		Car.sortCars(cars);
		for(Car current : cars) {
			System.out.println(current);
		}
		
	}
}
