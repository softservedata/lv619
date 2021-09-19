package com.softserve.pt6.task2;

public class App2 {
    static  Line[] lines = new Line[5];
    public static void main(String[] args) {
        initalization();
        for (Line line: lines) {
            line.print();
        }

    }
    public static void initalization() {
        lines[0] = new Line(new Point(0, 0), new Point(1, 1));
        lines[1] = new ColorLine(new Point(2, 1), new Point(1, 1), "green");
        lines[2] = new ColorLine(new Point(0, 0), new Point(3, 4), "yellow");
        lines[3] = new Line(new Point(1, 0), new Point(1, 1));
        lines[4] = new Line(new Point(0, 3), new Point(1, 2));
    }
}
