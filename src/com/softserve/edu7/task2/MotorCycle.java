package com.softserve.edu7.task2;

public class MotorCycle extends GroundVechile{
    private int maxSpeed;

    public MotorCycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
