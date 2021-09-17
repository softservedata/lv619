package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App4 {
    static double[] numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        for (int i = 0; i < Integer.parseInt(reader.readLine()); i++) {
            System.out.printf("Input %d number %n", i + 1);
            numbers[i] = Double.parseDouble(reader.readLine());
        }
        System.out.println(Arrays.toString(createOrder(numbers)));
        reader.close();
    }
    public static double[] createOrder(double[] numbers) {
        double sum = 0;
        double[] order = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
            order[i] = sum;
        }
        return order;
    }
}
