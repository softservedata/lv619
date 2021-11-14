package _11_exceptions.pt2;

import static __myLib.Rand.randInt;

public class Appl {
	// //////////////////////////////////////////////////////////////////////////
	// Create a class Plant, which includes fields int size, Color color and Type
	// type,
	// and constructor where these fields are initialized.
	// Color and type are Enum. Override the method toString( ).
	// Create classes ColorException and TypeException and describe there
	// all possible colors and types of plants.
	// In the method main create an array of five plants. Check to work your
	// exceptions.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Plant[] plants = new Plant[5];
		for (int i = 0; i < plants.length; ++i) {
			System.out.print(i + 1 + ") ");
			try {
				plants[i] = new Plant(randInt(10) == 0 ? randInt(Integer.MIN_VALUE + 2) : randInt(Integer.MAX_VALUE),
						"color" + (randInt(10) == 0 ? randInt(6, Integer.MAX_VALUE) : randInt(1, 5)),
						"type" + (randInt(10) == 0 ? randInt(6, Integer.MAX_VALUE) : randInt(1, 5)));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			if (plants[i] != null)
				System.out.println(plants[i]);
		}
	}
	////////////////////////////////////////////////////////////////////////////
}