package com.softserve.pt7.task1;

public class App {
    static Animal [] animals = new Animal[2];

    public static void main(String[] args) {
        initialization();
        for (Animal animal: animals) {
            animal.voice();
            System.out.println(animal.feed());
        }

    }
    static void initialization() {
        animals[0] = new Dog();
        animals[1] = new Cat();
    }
}
