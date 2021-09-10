package com.softserve.edu6.homework1;

import com.softserve.edu6.homework1.Bird;

public class NonFlyingBirds extends Bird {
    public NonFlyingBirds(String feathers) {
        super(feathers);
    }
    public void fly() {
        System.out.println("These birds don't fly :(");
    }
    public void run() {
        System.out.println("Running");
    }
    @Override
    public String toString() {
        return "This is bird who can not fly from " + getClass().getName();
    }
}
