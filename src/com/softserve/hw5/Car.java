package com.softserve.hw5;

import java.util.Arrays;
import java.util.Objects;

public class Car implements Comparable<Car>{
    private String type;
    private int yearProduction;
    private float engineCapacity;

    public Car(String type, int yearProduction, float engineCapacity) {
        setType(type);
        setYearProduction(yearProduction);
        setEngineCapacity(engineCapacity);
    }

    public static Car[] sortByYear(Car[] cars){
        Arrays.sort(cars);
        return cars;
    }
    
    public static Car[] getCarsByYear(int year, Car[] cars) {
        int counter = 0;
        for (Car car: cars) {
            if (car.getYearProduction() == year) {
                counter++;
            }
        }
        Car [] a = new Car[counter];
        int i = 0;
        for (Car car: cars) {
            if (car.getYearProduction() == year) {
                a[i] = car;
                i++;
            }
        }
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYearProduction() == car.getYearProduction() && Float.compare(car.getEngineCapacity(), getEngineCapacity()) == 0 && getType().equals(car.getType());
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearProduction=" + yearProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getYearProduction(), getEngineCapacity());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int compareTo(Car car) {
        return getYearProduction() - car.getYearProduction();
    }
}
