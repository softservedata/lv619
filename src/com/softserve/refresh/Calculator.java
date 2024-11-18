package com.softserve.refresh;

public class Calculator {
    public static double getTotalArea(Figure ...  figure) {
        double totalArea = 0;
        for (int i = 0; i < figure.length; i++) {
            totalArea += figure[i].calculateArea();
        }
        totalArea = (Math.round(totalArea * 100))/100.0;
        return totalArea;
    }

}

abstract class Figure {
    public abstract double calculateArea();
}

class Triangle extends Figure{
    double triangleBase;
    double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    public double calculateArea() {
        return (triangleBase * triangleHeight)/2;
    }
}

class Square extends Figure {
    double side;
    public Square(double side) {
        this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
}

class Rectangle extends Figure{
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double calculateArea() {
        return height * width;
    }
}

class Circle extends Figure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}