package com.softserve.pt6.task2;

public class Line {
    Point x1;
    Point x2;

    public Line(Point x1, Point x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public void print() {
        System.out.println("Line print");
    }

    @Override
    public String toString() {
        return "Line{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
