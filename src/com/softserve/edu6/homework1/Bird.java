package com.softserve.edu6.homework1;

public abstract class Bird {
    private String feathers;

    public Bird(String feathers) {
        this.feathers = feathers;
    }
    public void layEggs(){
        System.out.println("Laing eggs");
    }
    public abstract void fly();

    @Override
    public String toString() {
        return "This bird from " + getClass().getName();
    }
}
