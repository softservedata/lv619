package com.softserve.pt6.task1;


public class App1 {
    public static Car[] cars = new Car[4];
    public static void main(String[] args) {
        initialization();
        for (Car car: cars) {
            System.out.println(car);
        }

    }
    public static void initialization() {
        cars[0] = new Sedan("VW", 200, 2001);
        cars[1] = new Sedan("BMW", 180, 1984);
        cars[2] = new Truck("Kamaz", 140, 1960);
        cars[3] = new Truck("Daff", 80, 200);
    }
}
