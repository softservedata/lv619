package com.company;

public class ColorBox extends Box {
    public Color color;

    public ColorBox() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Width = " + this.width;
    }
}