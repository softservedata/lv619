package com.softserve.edu6.homework1;

public class Eagle extends FlyingBirds {
    public Eagle(String feathers, int heightOfFly, float speedOfFly) {
        super(feathers,heightOfFly,speedOfFly);
    }
    public void hunt() {
        System.out.println("Eagle is hunting");
    }
    @Override
    public String toString() {
        return "This is bird eagle from " + getClass().getName();
    }
}
