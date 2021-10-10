package hw008OOP2.prTask2;

public class Teacher extends Staff {
	
	private String TYPE_PERSON = getClass().getSimpleName().toLowerCase();
	
	public String getType() {
		return TYPE_PERSON;
	}
	
	
	public Teacher(String name) {
		super(name);	
	}
	
	public double getSalary() {
		return 8000.0;
	}
	
	@Override
	public void print() {
		System.out.print("\nI am a " + this.getType() + ", my name is: " + this.getName());
	}

}
