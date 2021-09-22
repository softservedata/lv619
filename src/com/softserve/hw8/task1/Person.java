package com.softserve.hw8.task1;

public abstract class Person {
    private int age;
    private FullName fullName;

    public Person(FullName fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d", fullName.getFirstName(), fullName.getLastName(), age);
    }

    public abstract String activity();
}
