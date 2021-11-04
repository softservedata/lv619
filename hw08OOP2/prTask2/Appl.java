package hw08OOP2.prTask2;

public class Appl {
	
	public static void main(String[] args) {
		Person[] people = new Person[6];
		people[0] = new Teacher("Yaroslav");
		people[1] = new Cleaner("Ivan");
		people[2] = new Student("Petro");
		people[3] = new Teacher("Vasyl");
		people[4] = new Cleaner("Roman");
		people[5] = new Student("Stepan");
		
		
		for(Person current : people) {
			current.print();
			if(current instanceof Staff) {
				System.out.println(", salary: " + ((Staff)current).getSalary());
			}
		}
	}

}
