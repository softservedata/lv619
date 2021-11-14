package _04_conditionStatementsFile.hw2;

class Dog {
	////////////////////////////////////////////////////////////////////////////
	private String name;
	private Breed breed;
	private int age;
	////////////////////////////////////////////////////////////////////////////
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	////////////////////////////////////////////////////////////////////////////
	String getName() {return name;}
	Breed getBreed() {return breed;}
	int getAge() {return age;}
	////////////////////////////////////////////////////////////////////////////
	static boolean containsTwoEqualDogNames(Dog... dogs) {
		for(int i = 0, j = i, n = dogs.length; i < n - 1 ; j = ++i)
			while(++j < n)
				if(dogs[i].getName().hashCode() ==
				dogs[j].getName().hashCode() &&
				dogs[i].getName().equals(dogs[j].getName()))
					return true;
		return false;
	}
	////////////////////////////////////////////////////////////////////////////
	static Dog findOldestDog(Dog... dogs) {
		Dog res = dogs[0];
		for(int i = 1; i < dogs.length; ++i)
			if(dogs[i].getAge() > res.getAge())
				res = dogs[i];
		return res;
	}
	////////////////////////////////////////////////////////////////////////////
	static void print(Dog...dogs) {
		for(Dog dog: dogs)
			System.out.println(dog);
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString(){
		return name + ":\tbreed is " + breed + ",\t age = " + age;
	}
	////////////////////////////////////////////////////////////////////////////
}