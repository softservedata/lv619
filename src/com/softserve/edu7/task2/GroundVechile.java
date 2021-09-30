package com.softserve.edu7.task2;

public class GroundVechile extends Passengers implements Vechile{
    public GroundVechile(int passengers) {
        super(passengers);
    }
    public void drive() {
        System.out.println("driving");
    }
}
