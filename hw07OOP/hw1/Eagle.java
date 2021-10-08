package hw07OOP.hw1;

public class Eagle extends FlyingBird {
	
	public Eagle(int x, int y) {
		super(x, y);
	}
	
	public String toString() {
		return "Eagle "+ super.fly();
	}
	
	

}
