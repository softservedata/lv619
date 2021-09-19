package com.softserve.pt7.task1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public String feed() {
        return "Meat";
    }
}
