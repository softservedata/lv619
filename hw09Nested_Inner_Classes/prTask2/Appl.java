package hw09Nested_Inner_Classes.prTask2;

public class Appl {
	
	public static void main(String[] args) {
		
		Wrapper<Shape> wr = new Wrapper<>(new Square());
		Wrapper<Shape> wr1 = new Wrapper<>(new Circle());
		//Wrapper wr3 = new Wrapper(new Circle());
		//Wrapper<Shape> wr2 = new Wrapper<>("Hello"); Compile error
	}

}
