package com.softserve.hw7.task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
