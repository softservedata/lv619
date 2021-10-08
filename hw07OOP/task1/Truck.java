package hw07OOP.task1;

public class Truck extends Car {
	
	public Truck (String mod, int x, int y) {
		super(mod, x, y);
	}
	@Override
	public void stop() {
		System.out.println("Truck stops");
	}
	@Override
	public void run() {
		System.out.println("Truck run");
	}
	@Override
	public String toString() {
		return "Truck " + super.toString();
	}

}
