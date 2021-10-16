package hw09Nested_Inner_Classes.hw01;

public abstract class Person {
	
	public static class FullName {
		
		private String firsname;
		private String lastname;
		
		FullName(String f, String l) {
			this.firsname = f;
			this.lastname = l;
		}
		
		public String getFname() {
			return firsname;
		}
		
		public String getLname() {
			return lastname;
		}
		
		public void setFname(String fname) {
			this.firsname = fname;
		}
		
		public void setLname(String lname) {
			this.lastname = lname;
		}
		
		public String toString() {
			return "Firstname: <" + firsname + "> " + ", lastname: <" + lastname + ">"; 
		}
		
		
	}
	
	private FullName fullname;
	private int age;
	
	public Person (FullName fullname, int age) {
		this.fullname = fullname;
		this.age  = age;
	}
	
	public FullName getFullName() {
		return fullname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String info() {
		return this.getFullName() + ", age: <" +  this.getAge() + ">";
	}
	
	public abstract String activity();
	
	
	
	
	

}
