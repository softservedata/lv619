package com.softserve.edu07c;

public class Cube extends Figure implements Volumetric {
    private double width;

    public Cube(double width) {
        this.width = width;
    }
    
    @Override
    public double getArea() {
        System.out.println("Run from Cube");
        return width*width;
    }
    
    @Override
    public double getVolume() {
        System.out.println("Run from Cube");
        return width*width*width;
    }
}
