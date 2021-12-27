package HW5;

public class Dog {

	enum Breed {
		Shepherd, Newfoundland, Pug
	}

	public String name;
	public Breed breed;
	public int age;

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog`s name=" + name + ", breed=" + breed + ", age=" + age + "";
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Kaiser", Breed.Shepherd, 5);
		Dog d2 = new Dog("Oskar", Breed.Newfoundland, 2);
		Dog d3 = new Dog("Rex", Breed.Pug, 1);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println();

		if (d1.name != d2.name && d1.name != d3.name && d2.name != d3.name) {
			System.out.println("There are no dogs with the same name");
		}

		if (d1.age > d2.age && d1.age > d3.age) {
			System.out.println(d1);
		} else if (d2.age > d1.age && d2.age > d3.age) {
			System.out.println(d2);
		} else
			System.out.println(d3);

	}

}
