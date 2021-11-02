package com.softserve.hw4;

public class Dog {
    public enum Breeds{
        LABRADOR, COLLIE, POODLE, RETRIEVER;
    }
    private String name;
    private Breeds breed;
    private int age;

    public Dog(String name, Breeds breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breeds getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
}
