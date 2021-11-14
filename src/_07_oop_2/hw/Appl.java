package _07_oop_2.hw;
import static __myLib.Rand.randInt;
import static __myLib.Rand.randLettersStringTitleCase;

import java.util.Arrays;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create Payment interface with the method calculatePay(),
	//	the base class Employee with a string variable employeeld.
	//	Create two classes SalariedEmployee and ContractEmployee,
	//	which implement interface and are inherited from the base class. 
	//	Describe hourly paid workers in the relevant classes(one of the children),
	//	and fixed paid workers (second child). 
	//	Describe the string variable socialSecurityNumber in the class SalariedEmployee .
	//	Include a description of federalTaxIdmember in the class of ContractEmployee.
	//	The calculation formula for the "time-worker“ is: the average monthly 
	//	salary = hourly rate * number of hours worked
	//	For employees with a fixed payment the formula is:
	//	the average monthly salary = fixed monthly payment
	//	Create an array of employees and add the employees with different form of payment.
	//	Arrange the entire sequence of workers descending the average monthly wage.
	//	Output the employee ID, name, and the average monthly wage for all elements of the list.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Employee[] empls = new Employee[6];
		System.out.println("\t\t\t  origin:");
		for(int i = 0; i < empls.length; ++i) {
			empls[i] = randInt(1) == 0 ? new ContractEmployee(
					"" + randInt(100000000, 999999999), randLettersStringTitleCase(),
					"" + randInt(100000000, 999999999), randInt(1000, 10000)) : 
						new SalariedEmployee(
								"" + randInt(100000000, 999999999), randLettersStringTitleCase(),
								"" + randInt(100000000, 999999999),
								randInt(10, 100) / 100d + randInt(10, 100), 
								randInt(350));
		System.out.println(empls[i]);
		}
		Arrays.sort(empls);
		System.out.println("\t\t\t  sorted:");
		for(Employee empl : empls)
			System.out.println(empl);
	}
	////////////////////////////////////////////////////////////////////////////
}