package com.softserve.hw7.task2;

public class Liner extends WaterVehicle{
    private int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
