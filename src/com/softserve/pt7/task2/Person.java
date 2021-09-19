package com.softserve.pt7.task2;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}
