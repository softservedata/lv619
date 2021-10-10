package hw008OOP2.prTask2;

public class Student extends Person {
	
	private String TYPE_PERSON = getClass().getSimpleName().toLowerCase();
	
	public String getType() {
		return TYPE_PERSON;
	}
	
	public Student(String name) {
		super(name);
		
	}
	@Override
	public void print() {
		System.out.print("\nI am a " + this.getType() + ", my name is: " + this.getName());
	}
	

}
