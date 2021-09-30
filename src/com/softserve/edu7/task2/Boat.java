package com.softserve.edu7.task2;

public class Boat extends WaterVechile{
    private int volume;
    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
