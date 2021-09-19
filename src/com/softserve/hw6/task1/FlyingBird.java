package com.softserve.hw6.task1;

public abstract class FlyingBird extends Bird{

    public FlyingBird(boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    public boolean fly() {
        return true;
    }
}
