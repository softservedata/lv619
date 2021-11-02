package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App12 {
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        try {
            int n = Integer.parseInt(reader.readLine());
            double[] rates = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Input %d rate %n", i + 1);
                rates[i] = Double.parseDouble(reader.readLine());
            }
            System.out.println("Final rate - " + findFinalRate(rates));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static double findFinalRate(double [] rates) {
        double min = rates[0];
        double max = rates[0];
        double sum = 0;
        for (double rate : rates) {
            if (rate < min) {
                min = rate;
            }
            if (rate > max) {
                max = rate;
            }
            sum += rate;
        }
        return (sum - max - min)/(rates.length - 2);
    }
}
