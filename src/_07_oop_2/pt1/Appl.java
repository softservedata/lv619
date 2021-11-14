package _07_oop_2.pt1;
import static __myLib.Rand.randInt;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create interface Animal with methods voice() and feed().
	//	Create two classes Cat and Dog, which implement this interface.
	//	Create array of Animal and add some Cats and Dogs to it.
	//	Call voice() and feed() method for all of it
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Animal[] animals = new Animal[6];
		for(int i = 0; i < animals.length; ++i) {
			animals[i] = randInt(1) == 0 ? new Cat() : new Dog();
			animals[i].voice();
			animals[i].feed();
			System.out.println("________");
		}
	}
	////////////////////////////////////////////////////////////////////////////
}