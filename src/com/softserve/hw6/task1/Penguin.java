package com.softserve.hw6.task1;

public class Penguin extends NonFlyingBird{

    public Penguin(boolean layEggs, String feathers) {
        super(layEggs, feathers);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "layEggs=" + layEggs +
                ", feathers='" + feathers + '\'' +
                '}';
    }
}
