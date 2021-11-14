package _05_arraysLoops.pt2;
import static __myLib.ConsoleInputReader.getCorrectIntValue;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

class App {
	////////////////////////////////////////////////////////////////////////////
	//	Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
	//	all employees of a certain department (enter department number in the console);
	//	arrange workers by the field salary in descending order.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Employee[] empls = new Employee[5];
		for(int i = 0; i < empls.length; ++i) {
				empls[i] = new Employee(
						randLettersStringTitleCase(), randInt(1, 3), randInt(100, 1000));
			System.out.println(empls[i]);
		}		
			Employee.sortBySalaryDscnd(empls);
			System.out.println("_______________________");
			for(int i = 0; i < empls.length; ++i)
				System.out.println(empls[i]);
			System.out.print("_______________________\nenter department number\n:");
			int depNum;
			while((depNum = getCorrectIntValue()) < 1 || depNum > 3)
				System.out.print("invalid input data. please retry\n:");
			Employee.printDepartmentEmployees(empls, depNum);
	}
	////////////////////////////////////////////////////////////////////////////
}