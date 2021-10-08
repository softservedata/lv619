package hw07OOP.hw1;

public class FlyingBird extends Bird {
	
	public FlyingBird (int x, int y) {
		super(x, y); 
	}
	
	@Override
	public String fly() {
		return "can fly";
	}
}


