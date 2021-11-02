package com.softserve.hw6.task1;

public class Swallow extends FlyingBird{

    public Swallow(boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "layEggs=" + layEggs +
                ", feathers='" + feathers + '\'' +
                '}';
    }
}
