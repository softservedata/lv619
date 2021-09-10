package com.softserve.edu6.homework1;

public class Chicken extends NonFlyingBirds {
    public Chicken(String feathers) {
        super(feathers);
    }
    public void peck() {
        System.out.println("Chicken is pecking");
    }
    @Override
    public String toString() {
        return "This is bird chicken from " + getClass().getName();
    }
}
