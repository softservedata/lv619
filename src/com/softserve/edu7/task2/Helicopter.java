package com.softserve.edu7.task2;

public class Helicopter extends FlyingVechile{
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

}
