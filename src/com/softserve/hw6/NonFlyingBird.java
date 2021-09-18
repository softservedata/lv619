package com.softserve.hw6;

public abstract class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    public boolean fly() {
        return false;
    }
}
