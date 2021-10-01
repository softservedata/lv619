package hw06ArraysAndLoops;
import java.util.Scanner;

public class Employee {
	
	private String name;
	private int department_number;
	private double salary;
	
	public Employee() {}

	public Employee(String n, int d, double s) {
		this.name = n;
		this.department_number = d;
		this.salary = s;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getDepartment_number() {
		return department_number;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment_number(int i) {
		this.department_number = i;
	}
	
	@Override
	public String toString() {
		return "Empl name = " + name + ", Empl department_number = " + department_number + ", empl salary = " + salary;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee [] arr = new Employee [5];
		arr[0] = new Employee("Ivan", 1, 10000.0);
		arr[1] = new Employee("Petro", 2, 7000.0);
		arr[2] = new Employee("Roman", 3, 8000.0);
		arr[3] = new Employee("Vasyl", 4, 4000.0);
		arr[4] = new Employee("Viktor", 5, 9000.0);
		
		/*-
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Set department of the " + arr[i].getName());
			arr[i].setDepartment_number(sc.nextInt());
		}
		*/
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		System.out.println("");
		
		System.out.println("Input department number:");
		int dep_number = sc.nextInt();
		
		System.out.println("Empl from department " + dep_number + " are:");
		
		for (int h = 0; h < arr.length; h++) {
			if (arr[h].getDepartment_number() == dep_number) {
				System.out.println("\t" + arr[h]);
			}
			
		}
		
		
		Employee buffer = new Employee();
		
		for (int f = 0; f <arr.length; f++) {
			for (int g = f+1; g < arr.length; g++) {
				if (arr[f].getSalary() < arr[g].getSalary()) {
					buffer = arr[g];
					arr[g] = arr[f];
					arr[f] = buffer;
				}
			}
		}
		
		System.out.println("");
		
		System.out.println("Workers sorted by salary in descending order:");
		
		for (Employee current : arr) {
			System.out.println("\t" + current);
		}
		
		
		sc.close();
	}
}
