package hw07OOP.task1;

public class Sedan extends Car {
	
	public Sedan (String mod, int x, int y) {
		super(mod, x, y);
	}
	
	@Override
	public void stop() {
		System.out.println("Sedan stops");
	}
	@Override
	public void run() {
		System.out.println("Sedan run");
	}
	@Override
	public String toString() {
		return "Sedan " + super.toString();
	}


}
