package hw08OOP2.prTask1;

public class Appl {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Cat();
		animals[3] = new Dog();
		
		
		for (Animal current : animals) {
			System.out.println(current.feed() + ", " + current.voice());
		}
	}

}
