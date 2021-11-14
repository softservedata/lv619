package _05_arraysLoops.hw4;
import static __myLib.ConsoleInputReader.getCorrectIntValue;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create class Car with fields type, year of production and engine capacity.
	//	Create and initialize four instances of class Car. Display cars
	//	- certain model year  (enter year in the console);
	//	- ordered by the field year.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Car[] cars =  AdditionalMethods.CarsInit(4);
		AdditionalMethods.printCars(cars);
		AdditionalMethods.sortCarsByProductionYear(cars);
		System.out.println("\t\t\tsorted by year:");
		AdditionalMethods.printCars(cars);
		System.out.println("__________\nenter year\n:");
		AdditionalMethods.printCars(cars, getCorrectIntValue(), "year");
	}
	////////////////////////////////////////////////////////////////////////////
}