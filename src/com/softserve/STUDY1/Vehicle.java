package com.softserve.STUDY1;

public class Vehicle {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

//    void distance (double interval){
//        double value = maxspeed * interval;
//        System.out.println("пройдет путь, равный " + value + " км");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
double distance(double interval) {
    double value = maxspeed * interval;
    return value;
    }

}
