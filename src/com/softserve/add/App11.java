package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        int n = Integer.parseInt(reader.readLine());
        double [] times = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Input time of %d customer %n", i + 1);
            times[i] = Double.parseDouble(reader.readLine());
        }
        System.out.println("Time in queue " + Arrays.toString(times));
        System.out.println("Times of all customers in queue " + Arrays.toString(findTimeInQueue(times)));
        System.out.println("Number of faster customer - " + findFasterCustomer(times));
        reader.close();

    }
    public static double[] findTimeInQueue(double [] times) {
        double [] timeInQueue = new double[times.length];
        double sum = 0;
        for (int i = 0; i < times.length; i++) {
            sum += times[i];
            timeInQueue[i] = sum;
        }

        return timeInQueue;
    }

    public static int findFasterCustomer(double [] times) {
        double min = times [0];
        int fasterCustomer = 0;
        for (int i = 0; i < times.length; i++) {
            if (times [i] < min) {
                min = times[i];
                fasterCustomer = i;
            }

        }
        return fasterCustomer + 1;
    }
}
