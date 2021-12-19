package HW4;

public class Person {

	private String firstName;
	private String lastName;
	private int birthYear;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person() {
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		int age = (2021 - birthYear);
		return age;
	}

	public void input(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public void output() {
		System.out.println("firstName = " + getFirstName() + "lastName = " + getLastName() + "age = " + getAge());
		// System.out.println("");
	}

	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		p1.input("Yevhen", "Kretovych", 1991);
		p2.input("Roman", "Mamedov", 1991);
		p3.input("Igor", "Gavrishenko", 1991);
		p4.input("Denis", "Gritsay", 1990);
		p5.input("Oleksandr", "Ostrovsky", 1993);
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();

	}

}
