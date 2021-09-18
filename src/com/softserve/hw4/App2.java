package com.softserve.hw4;

public class App2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog1", Dog.Breeds.COLLIE, 7);
        Dog dog2 = new Dog("Dog2", Dog.Breeds.RETRIEVER, 7);
        Dog dog3 = new Dog("Dog3", Dog.Breeds.LABRADOR, 3);

        if (dog1.getName().equals(dog2.getName()) || dog2.getName().equals(dog3.getName()) ||
                dog1.getName().equals(dog3.getName())) {
            System.out.println("There are minimum two dogs with the same name");
        }
        else {
            System.out.println("There is no dogs with the same name");
        }

        if (dog1.getAge() >= dog2.getAge() && dog1.getAge()>= dog3.getAge()) {
            System.out.println(dog1);
        }
        if (dog2.getAge() >= dog1.getAge() && dog2.getAge()>= dog3.getAge()) {
            System.out.println(dog2);
        }
        if (dog3.getAge() >= dog1.getAge() && dog3.getAge()>= dog2.getAge()) {
            System.out.println(dog3);
        }

    }
}
