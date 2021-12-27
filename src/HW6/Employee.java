package HW6;

import java.util.Scanner;

public class Employee {
	public String name;
	public int department;
	public int salary;

	public Employee(String name, int department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee name = " + name + ", Employee department = " + department + ", Employee salary = " + salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee[] emp = new Employee[5];
		emp[0] = new Employee("Olesya", 1, 12000);
		emp[1] = new Employee("Yulia", 2, 8000);
		emp[2] = new Employee("Denis", 1, 10000);
		emp[3] = new Employee("Sasha", 3, 6000);
		emp[4] = new Employee("Lisa", 3, 6000);

		System.out.print("Enter the number of department:");
		int d = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (emp[i].department == d) {
				System.out.println(emp[i]);
			}
		}
		System.out.println();

		int n;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].salary < emp[j].salary) {
					n = emp[i].salary;
					emp[i].salary = emp[j].salary;
					emp[j].salary = n;
				}
			}
		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
	}

}
