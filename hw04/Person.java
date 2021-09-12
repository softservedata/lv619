package hw04;

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	
	public Person () {}
		
	
	public Person (String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
		
	}
	
	public void setfName(String fn) {
		this.firstName = fn;
	}
	
	public void setlName(String ln) {
		this.lastName = ln;
	}
	
	public void setbYear(int by) {
		this.birthYear = by;
	}
	
	
	public String getfName() {
		return this.firstName;
	}
	
	public String getlName() {
		return this.lastName;
	}
	
	public int getbYear() {
		return this.birthYear;
	}
	
	public int getAge() {
		return (2021 - birthYear); 
	}
	
	public void input(String fn, String ln, int y) {
		firstName = fn;
		lastName = ln;
		birthYear = y;
	}
	
	//@Override
	//public String toString() {
		//return "Person [firstName =" + firstName + ",lastName = " + lastName + ", age = " + getAge() + "]";
	//}
	
	public void output () {
		System.out.println("Persons firstName = " + getfName() + ", lastName = " + getlName() + ", age = " + getAge());
	}
	
	public void changeName(String fn,String ln) {
		if (fn != null) {
			this.firstName = fn;
		}
		
		if (ln != null) {
			this.lastName = ln;
		}
	}
	
	public static void main (String[] args) {
		Person person1 = new Person ();
		Person person2 = new Person ();
		Person person3 = new Person ();
		Person person4 = new Person ();
		Person person5 = new Person ();
		person1.input("Igor", "Shevchenko", 1985);
		person1.output();
		person1.changeName(null, "Petrenko");
		
		person2.input("Taras", "Bondarenko", 1987);
		person3.input("Vasyl", "Smilka", 1989);
		person4.input("Roman", "Romanov", 1991);
		person5.input("Igor", "Kozlov", 1993);
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
	}

}
