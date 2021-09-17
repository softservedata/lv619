package com.softserve.pt5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App1 {
    static int [] numbers = new int[10];
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input numbers");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Input %d number%n", i);
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        System.out.println(Arrays.toString(numbers));
        System.out.println("The biggest of these numbers - " + findBiggest(numbers));
        System.out.println("The sum of positive numbers in the array - " + findSumPositive(numbers));
        System.out.println("The amount of negative numbers in the array - " + findAmountOfNegative(numbers));
        System.out.println("Values there are more: " + findValuesMore(numbers));

    }
    public static int findBiggest(int [] numbers) {
        int biggest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }
        return biggest;
    }
    public static int findSumPositive(int [] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int findAmountOfNegative(int [] numbers) {
        int amount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                amount++;
            }
        }
        return amount;
    }

    public static int findAmountOfPositive(int [] numbers) {
        int amount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                amount++;
            }
        }
        return amount;
    }

    public static String findValuesMore(int [] numbers) {
        if (findAmountOfNegative(numbers) > findAmountOfPositive(numbers)) {
            return "negative";
        }
        if (findAmountOfNegative(numbers) < findAmountOfPositive(numbers)) {
            return "positive";
        }
        return "equal";
    }

}
