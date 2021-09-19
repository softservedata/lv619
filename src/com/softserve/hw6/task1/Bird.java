package com.softserve.hw6.task1;

public  abstract class Bird {
    boolean layEggs;
    String feathers;

    public Bird(boolean layEggs, String feathers) {
        this.layEggs = layEggs;
        this.feathers = feathers;
    }

    public abstract boolean fly();
}
