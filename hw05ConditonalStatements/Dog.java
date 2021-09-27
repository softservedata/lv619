package hw05ConditonalStatements;

public class Dog {
	
	enum Breed {
		BREED01, BREED02, BREED03;
	}
	
	private String name;
	private Breed breed;
	private int age;
	
	public Dog() {}
	
	public Dog (String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		
	}
	
	public Breed getBreed () {
		return breed;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
	public static boolean checkSameName(Dog...dogs) {
		int n = dogs.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dogs[i].name.equalsIgnoreCase(dogs[j].name) && (i != j)) {
                    return true;
                }
            }
        }
        return false;
	}
			
	
	
	
	
	public static Dog checkOldestDog (Dog...dogs) {
		int k = 0;
		Dog oldestdog = new Dog();
		while (k < dogs.length) {
			if (dogs[k].getAge() > oldestdog.getAge()) {
				oldestdog = dogs[k];
			}
			k++;
		}
		return oldestdog;
	}
	@Override
	public String toString() {
		return "name is " + name + ", Breed : " + breed + " ,age = " +age;
	}
	
	public static void main (String[] args) {
		Dog [] dogs = new Dog [3];
		dogs[0] = new Dog("Rex", Breed.BREED01, 17);
		dogs[1] = new Dog("Bud", Breed.BREED02, 11);
		dogs[2] = new Dog("Rex", Breed.BREED03, 6);
		
		
		for (int h = 0; h < dogs.length; h++) {
			System.out.println(dogs[h]);
		}
		
		System.out.println("There " + (Dog.checkSameName(dogs) ? "are" : "are no") + " dogs with the same name.");
		System.out.println("The oldest " + (Dog.checkOldestDog(dogs)));
		//System.out.println(dogs.length);
		
	}

}
