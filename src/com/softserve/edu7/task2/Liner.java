package com.softserve.edu7.task2;

public class Liner extends WaterVechile{
    private int floors;
    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
}
