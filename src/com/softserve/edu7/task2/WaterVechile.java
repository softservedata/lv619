package com.softserve.edu7.task2;

public class WaterVechile extends Passengers implements Vechile {
    public WaterVechile(int passengers) {
    super(passengers);
    }
    public void isSailing() {
        System.out.println("WaterVechile sailing");
    }
}
