package com.softserve.edu05;
import java.util.Scanner;

public class Car {
	
	private String type;
	private int yearOfProduction;
	private int engineCapacity;
	Scanner in = new Scanner(System.in);
	
	public Car(String type, int engineCapacity) {
		System.out.print("\nWrite year of car:");
		int yearOfProduction = in.nextInt();
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
	
	public String getType() {
		return type;
	}
	
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}

	public static Car[] sortCars(Car[] car) {
		for (int i = 0; i < car.length; i++) {
			for(int j = 0; j < car.length-i-1;j++) {
				if (car[j].yearOfProduction > car[j+1].yearOfProduction) {
					Car temp = car[j];
					car[j] = car[j+1];
					car[j+1] = temp;
				}
			}
		}

		return car;
	}
	
	@Override
	public String toString() {
		return type + " " + yearOfProduction + " " + engineCapacity;
	}
	
}
