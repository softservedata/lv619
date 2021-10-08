package hw07OOP.hw2;

public class App {
	
	public static void main(String[] args) {
		
		Employee[] members = new Employee[4];
		members[0] = new Employee("Ivan", 25, 10000.0);
		members[1] = new Developer("Petro", 25, 15000.0, "Junior Java dev");
		members[2] = new Employee("Nazar", 25, 20000.0);
		members[3] = new Developer("Roman", 25, 100000.0, "Senior Java dev");
		
		
		for (Employee current : members) {
			System.out.println(current.report());
		}
	}

}
