package com.softserve.edu7.task2;

public class Car extends GroundVechile{
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
