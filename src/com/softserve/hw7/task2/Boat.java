package com.softserve.hw7.task2;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
