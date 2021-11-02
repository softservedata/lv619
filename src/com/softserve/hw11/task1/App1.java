package com.softserve.hw11.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App1 {
    static double a1;
    static double a2;
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 1st number");
        try {
            a1 = Double.parseDouble(reader.readLine());
            System.out.println("Input 2st number");
            a2 = Double.parseDouble(reader.readLine());
            System.out.println("result = " + div(a1,a2));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

    }
    public static double div(double a1, double a2) {
        return a1/a2;
    }
}
