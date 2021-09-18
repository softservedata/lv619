package com.softserve.hw6;

public class Eagle extends FlyingBird{

    public Eagle(boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "layEggs=" + layEggs +
                ", feathers='" + feathers + '\'' +
                '}';
    }
}
