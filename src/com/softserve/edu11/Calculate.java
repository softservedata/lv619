package com.softserve.edu11;

public class Calculate {
    private Calculate(){}

    public static double div(double a, double b) {
        if (b == 0) throw new ArithmeticException("Invalid values");
        else return a/b;
    }
}
