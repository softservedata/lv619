package com.softserve.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {
    public static void main(String[] args) {
        System.out.println("Input radius");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            double radius = Double.parseDouble(reader.readLine());
            reader.close();
            double perimetr = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Perimetr=" + perimetr);
            System.out.println("Area=" + area);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
