package _07_oop_2.pt1;

interface Animal {
	void voice();
	default void feed() {
		System.out.println(getClass().getSimpleName() + " eats");}
}