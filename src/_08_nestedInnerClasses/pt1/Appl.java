package _08_nestedInnerClasses.pt1;
import static __myLib.Rand.randColorStr;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Suppose we have the class Car.
	//	Create public static inner class CarBuilder inside of Car class
	//	correspond to the next class diagram.
	//	Create a car with four different parameters and
	//	print info about this car and its parameters
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Car.CarBuilder cb = Car.getCar();
		Set<Integer> paramsToSet = new HashSet<>();
			while(paramsToSet.size() != 4)
				paramsToSet.add(randInt(5));
		for(int paramNum: paramsToSet)
			switch(paramNum) {
			case 0: cb.addModel(randLettersStringTitleCase()); break;
			case 1: cb.addDateOfProduction(LocalDate.parse(
					randInt(1940, 2020) + "-" +
					("" + (randInt(1, 12) + 100)).substring(1)  + "-" +
					("" + (randInt(1, 28) + 100)).substring(1))); break;
			case 2: cb.addEngineCapacity(randInt(0, 100) / 100d + randInt(1, 3)); break;
			case 3: cb.addColor(randColorStr()); break;
			case 4: cb.addPassengerCapacity(randInt(1, 4)); break;
			case 5: cb.setIsAirConditioning(randInt(1) == 0); break;
			}
		System.out.println(cb.getCar());
	}
	////////////////////////////////////////////////////////////////////////////
}