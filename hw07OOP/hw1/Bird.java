package hw07OOP.hw1;

public abstract class Bird {
	
	int feathers;
	int layEggs;
	
	public Bird(int x, int y) {
		this.feathers = x;
		this.layEggs = y;
	}
	
	abstract String fly(); 

}
