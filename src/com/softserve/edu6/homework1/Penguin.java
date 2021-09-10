package com.softserve.edu6.homework1;

import com.softserve.edu6.homework1.NonFlyingBirds;

public class Penguin extends NonFlyingBirds {
    public Penguin(String feathers) {
        super(feathers);
    }
    public void swim() {
        System.out.println("Penguin is swimming");
    }
    @Override
    public String toString() {
        return "This is bird penguin from " + getClass().getName();
    }
}
