package com.softserve.pt8.task1;

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

    public static class CarBuilder{
        private Car car = new Car();
        public CarBuilder() {
        }
        public CarBuilder addModel(String model) {
            car.model = model;
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
            car.dateOfProduction = dateOfProduction;
            return this;
        }

        public CarBuilder addEngineCapacity(double engineCapacity) {
            car.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addColor(String color) {
            car.color = color;
            return this;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity) {
            car.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder setIsAirConditioning(boolean isAirConditioning) {
            car.isAirConditioning = isAirConditioning;
            return this;
        }

        public Car build() {
            return car;
        }

    }

    public static CarBuilder getCar() {

        return new CarBuilder();
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
