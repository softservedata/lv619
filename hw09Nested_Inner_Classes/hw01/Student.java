package hw09Nested_Inner_Classes.hw01;

public class Student extends Person{
	
	private int course;
	
	public Student(String f, String l, int age, int course) {
		super(new FullName(f, l), age);
		this.course = course;
	}
	
	public int getCourse() {
		return this.course;
	}
	@Override
	public String activity() {
		return "I study at University at " + getCourse() + " course!";
		
	}
	
	public static void main(String[] args) {
		
		Student st1 = new Student("Ivan", "Ivanov", 22, 5);
		
		System.out.println(st1.info() + "\n" + st1.activity());
		
	}

}
