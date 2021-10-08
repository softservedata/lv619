package hw07OOP.hw1;

public class NonFlyingBird extends Bird {
	
	public NonFlyingBird(int x, int y) {
		super(x, y); 
	}
	
	@Override
	public String fly() {
		return "can't fly";
	}
}
