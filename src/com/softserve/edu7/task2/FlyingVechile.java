package com.softserve.edu7.task2;

public class FlyingVechile extends Passengers implements Vechile{
    public FlyingVechile(int passengers) {
        super(passengers);
    }
    public void fly() {
        System.out.println("Flying...");
    }
    public void land() {
        System.out.println("landing...");
    }
}
