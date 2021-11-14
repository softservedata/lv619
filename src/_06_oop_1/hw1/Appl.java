package _06_oop_1.hw1;
import static __myLib.Rand.randInt;

class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Develop abstract class Bird with
	//	attributes feathers and layEggs and an abstarct method fly().  
	//	Develop classes FlyingBird and NonFlyingBird.
	//	Create class Eagle, Swallow, Penguin and Chicken. 
	//	Create array Bird and add different birds to it. 
	//	Call fly() method for all of it. Output the 
	//	information about each type of created bird
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Bird[] birds = new Bird[6];
		for(int i = 0; i < birds.length; ++i) {
			switch (randInt(3)) {
			case 0: birds[i] = new Chicken(); break;
			case 1: birds[i] = new Eagle(); break;
			case 2: birds[i] = new Penguin(); break;
			case 3: birds[i] = new Swallow(); break;
			}
			System.out.println(birds[i]);
			birds[i].fly();
			System.out.println();
		}
	}
	////////////////////////////////////////////////////////////////////////////
}