package com.softserve.pt6;

public class ColorLine extends Line{
    String Color;

    public ColorLine(Point x1, Point x2, String color) {
        super(x1, x2);
        Color = color;
    }

    public void print() {
        System.out.println("ColorLine print");
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "Color='" + Color + '\'' +
                ", x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
