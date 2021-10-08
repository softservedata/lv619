package hw07OOP.hw1;

public class Appl {
	
	public static void main(String[] args) {
		Bird[] birds = new Bird[4];
			birds[0] = new Chicken (4, 21);
		
			birds[1] = new Eagle (5, 3);
			birds[2] = new Swallow (5, 6);
			birds[3] = new Penguin (4, 2);
	
	
			for(Bird bird : birds) {
				System.out.println(bird);
			}
		
	}

}
