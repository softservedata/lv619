package com.softserve.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App2 {
    static Car [] cars = new Car[4];
    public static void main(String[] args) throws IOException {
        initialization();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Year");
        int year = Integer.parseInt(reader.readLine());
        System.out.println("Cars year production " + year);
        System.out.println(Arrays.toString(Car.getCarsByYear(year, cars)));
        System.out.println("Cars sorted my year");
        System.out.println(Arrays.toString(Car.sortByYear(cars)));

    }
    
    public static void initialization() {
        cars[0] = new Car("VW", 2011, 2.0F);
        cars[1] = new Car("BMW", 2011, 1.8F);
        cars[2] = new Car("Mercedes", 2000, 2.3F);
        cars[3] = new Car("Audi", 2004, 3.0F);
    }
}
