package hw07OOP.hw1;

public class Chicken extends NonFlyingBird {
	
	public Chicken(int x, int y) {
		super(x, y);
	}
	
	public String toString() {
		return "Chicken "+ super.fly();
	} 

}
