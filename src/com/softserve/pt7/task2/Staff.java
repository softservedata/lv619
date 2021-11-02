package com.softserve.pt7.task2;

public abstract class Staff extends Person{

    public Staff(String name) {
        super(name);
    }

    public abstract int salary();
}
