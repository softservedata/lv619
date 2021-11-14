package _04_conditionStatementsFile.hw2;

public class App {
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Dog[] dogs = new Dog[] {
				new Dog("aduhiwua", Breed.BREED1, 10),
				new Dog("dapda", Breed.BREED2, 12),
				new Dog("adwaihgdha", Breed.BREED3, 11)};
		Dog.print(dogs);
		System.out.println("there" + 
		(Dog.containsTwoEqualDogNames(dogs) ? " are" : "'s no") +
		" dogs with the same name");
		System.out.println("oldest dog is " + Dog.findOldestDog(dogs));
	}
	////////////////////////////////////////////////////////////////////////////
}