package com.softserve.pt7.task1;

public class Cat implements Animal{

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public String feed() {
        return "Wiskas";
    }
}
