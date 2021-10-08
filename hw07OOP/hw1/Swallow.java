package hw07OOP.hw1;

public class Swallow extends FlyingBird {
	
	public Swallow(int x, int y) {
		super(x, y);
	}
	
	public String toString() {
		return "Swallow "+ super.fly();
	}

}
