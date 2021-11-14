package _06_oop_1.hw2;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Support we have a class Employee
	//	Create a Developer class that extends the Employee class.
	//	Creates a String field and a constructor to initialize all fields in the Developer class.
	//	Also in the Developer class, override the method report()
	//	so that it returns a string with information about the developer, for example:
	//	Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
	//	If necessary, modify the employee's class so that it meets
	//	the principles of encapsulation and inheritance.
	//	Create an instance of the Employee and Developer class and
	//	print in the console information about them using report() method.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		String position = "";
		switch (randInt(7)) {
		case 0: position = "Frontend Developer"; break;
		case 1: position = "Backend Developer"; break;
		case 2: position = "Full stack Developer"; break;
		case 3: position = "Mobile Developer"; break;
		case 4: position = "Game Developer"; break;
		case 5: position = "Data Scientist Developer"; break;
		case 6: position = "DevOps Developer"; break;
		case 7: position = "Software Developer"; break;
		}
		System.out.println(new Employee(randLettersStringTitleCase(), randInt(18, 70),
				(double)randInt(1000, 10000) + randInt(99) / 100d).report());
		System.out.println(new Developer(randLettersStringTitleCase(), randInt(18, 70),
				(double)randInt(1000, 10000) + randInt(99) / 100d, position).report());
	}
	////////////////////////////////////////////////////////////////////////////
}