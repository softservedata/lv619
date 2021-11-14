package _07_oop_2.pt2;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create next structure.
	//	In abstract class Person with property name, declare abstract method print().
	//	In other classes in body of method print() output text “I am a …”.
	//	In class Staff declare abstract method salary().
	//	In each concrete class create constant TYPE_PERSON.
	//	Output type of person in each constructors.
	//	Create array of Person and add some Teachers, Cleaners and Students to it.
	//	Call method print() for all of it. Call method salary() for all Teachers and Cleaner
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		for(int i = 0, rand = randInt(2); i < persons.length; ++i, rand = randInt(2)) {
			persons[i] = rand == 0 ? new Teacher(randLettersStringTitleCase()) : 
				rand == 1 ? new Cleaner(randLettersStringTitleCase()) : new Student(randLettersStringTitleCase());
			persons[i].print();
			if(persons[i] instanceof Staff)
				((Staff)persons[i]).salary();
			System.out.println("_______");
		}
	}
	////////////////////////////////////////////////////////////////////////////
}