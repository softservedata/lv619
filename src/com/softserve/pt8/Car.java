package com.softserve.pt8;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car() {
    }

    public static CarBuilder getCar() {

        return new CarBuilder();
    }
    public static class CarBuilder{
        public CarBuilder() {
        }
        public CarBuilder addModel(String model) {
            CarBuilder carBuilder = new CarBuilder();

            return carBuilder;
        }

        /*public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
            CarBuilder carBuilder = new CarBuilder();
            return carBuilder;
        }

        public CarBuilder addEngineCapacity(double engineCapacity) {
            CarBuilder carBuilder = new CarBuilder();
            carBuilder.engineCapacity = engineCapacity;
            return carBuilder;
        }

        public CarBuilder addColor(String color) {
            CarBuilder carBuilder = new CarBuilder();
            carBuilder.color = color;
            return carBuilder;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity) {
            CarBuilder carBuilder = new CarBuilder();
            carBuilder.passengerCapacity = passengerCapacity;
            return carBuilder;
        }

        public CarBuilder setIsAirConditioning(boolean isAirConditioning) {
            CarBuilder carBuilder = new CarBuilder();
            carBuilder.isAirConditioning = isAirConditioning;
            return carBuilder;
        }
        */
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }
}
