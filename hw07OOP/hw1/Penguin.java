package hw07OOP.hw1;

public class Penguin extends NonFlyingBird {
	
	public Penguin(int x, int y) {
		super(x, y);
	}
	
	public String toString() {
		return "Penguin "+ super.fly();
	}

}


