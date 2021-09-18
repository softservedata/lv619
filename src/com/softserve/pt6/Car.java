package com.softserve.pt6;

public abstract class Car {
    String model;
    int maxSpeed, yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void run();
    public abstract void stop();

}
