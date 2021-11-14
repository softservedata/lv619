package _06_oop_1.pt1;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create abstract class Car with
	//	model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
	//	Develop classes Truck and Sedan which extend class Car.
	//	In main method create array of Car’s objects.
	//	Add to this array some trucks and sedans and print info about it
	////////////////////////////////////////////////////////////////////////////
	public static String randStrCarModelAlike() {
		StringBuilder sb = new StringBuilder(randInt(1) == 0 ? randLettersStringTitleCase() : 
			(char)randInt(65, 90) + String.valueOf(randInt(110) * 10));
		while(randInt(1) == 0)
			sb.append(randInt(1) == 0 ? ' ' : '-').append(randInt(1) == 0 ? 
					randLettersStringTitleCase() :
						(randInt(1) == 0 ? (char)randInt(65, 90) : "") +
						String.valueOf(randInt(110) * 10));
	return sb.toString();
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Car[] cars = new Car[6];
		for(int i = 0 ; i < cars.length; ++i)
			cars[i] = randInt(1) == 1 ?
					new Truck(randLettersStringTitleCase(),
							randInt(100, 300), randInt(1888, 2021)) :
								new Sedan(randStrCarModelAlike(),
										randInt(100, 300), randInt(1888, 2021));
		for(Car car: cars)
			System.out.println(car);
	}
	////////////////////////////////////////////////////////////////////////////
}