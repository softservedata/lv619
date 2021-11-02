package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App4 {
    static double[] numbers;
    public static void main(String[] args)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        try {
            for (int i = 0; i < Integer.parseInt(reader.readLine()); i++) {
                System.out.printf("Input %d number %n", i + 1);
                numbers[i] = Double.parseDouble(reader.readLine());
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wrong input");
            }

        System.out.println(Arrays.toString(createOrder(numbers)));

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
