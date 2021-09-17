package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Input radius");
        double radius = Integer.parseInt(reader.readLine());
        double [] points = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Input %d point %n", i + 1);
            points[i] = Double.parseDouble(reader.readLine());
        }
        System.out.println("number of points in circle - " + countPointsInCircle(points, radius));
        reader.close();

    }
    public static int countPointsInCircle(double[] points, double radius) {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            if((Math.sqrt(Math.pow(points[i],2)
                    + Math.pow(points[(points.length - 1) - i],2))) <= radius) {
                count++;
            }
        }
        return count;
    }
}
