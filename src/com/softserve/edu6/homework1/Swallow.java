package com.softserve.edu6.homework1;

import com.softserve.edu6.homework1.FlyingBirds;

public class Swallow extends FlyingBirds {
    public Swallow(String feathers, int heightOfFly, float speedOfFly) {
        super(feathers,heightOfFly,speedOfFly);
    }
    public void sing() {
        System.out.println("Swallow is singing");
    }
    @Override
    public String toString() {
        return "This is bird swallow from " + getClass().getName();
    }
}
