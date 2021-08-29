package com.softserve.edu4;

public class Dog {
    private Breeds breed;
    private String name;
    private int age;

    public Dog(Breeds breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    public boolean checkName(Dog other) {
        return this.name.equals(other.name);
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return breed + " with name " + name;
    }

}
