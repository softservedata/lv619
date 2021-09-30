package com.softserve.edu7.task2;

public class Plane extends FlyingVechile{
    private  int maxDistanse;
    public Plane(int passengers,int maxDistanse) {
        super(passengers);
        this.maxDistanse = maxDistanse;
    }
    public int getMaxDistanse() {
        return maxDistanse;
    }
    public void setMaxDistanse(int maxDistanse) {
        this.maxDistanse = maxDistanse;
    }
}
