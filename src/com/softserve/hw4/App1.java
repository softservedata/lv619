package com.sofserve.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App1 {

    public static void main(String[] args) throws IOException {
        //task1();
        //task2();
        task3();

    }
    public static void task1() throws IOException {
        int [] numberOfDays =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number of Mounth");
        System.out.println("Number of days in this Mounth will be "
                + numberOfDays[Integer.parseInt(reader.readLine())-1] );
        reader.close();
    }
    public static void task2() throws IOException {
        int [] numbers = new int[10];
        int sum = 0;
        int product = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            System.out.format("Enter %d number%n", i+1);
            numbers [i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                sum+= numbers[i];
                if (i == 4) {
                    System.out.println("Sum of first members = " + sum);
                }
            }
            else {
                for (int j = 5; j < numbers.length; j++) {
                    product*= numbers[j];
                }
                System.out.println("Product of last members = " + product);
                break;
            }
        }
        reader.close();
    }
    public static void task3() throws IOException {
        int [] numbers = new int[5];
        int counter = -1;
        int positionOfSecondPositiveNumber = 0;
        int minimum = 0;
        int positionMinimum = 0;
        int productEven = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            System.out.format("Enter %d number%n", i+1);
            numbers[i] = Integer.parseInt(reader.readLine());
            if (i == 0) {
                minimum = numbers[0];
                positionMinimum = 1;
            }
            if (numbers[i] % 2 == 0) {
                productEven *= numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
                positionMinimum = i+1;
            }
            if (numbers[i] < 0) {
                break;
            }
            else {
                counter++;
                if (counter == 1) {
                    positionOfSecondPositiveNumber = i+1;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        if (positionOfSecondPositiveNumber < 2) {
            System.out.println("There is no two positive nubers in array");
        }
        else {
            System.out.println("Position of second positive number " + positionOfSecondPositiveNumber);;
        }
        System.out.format("Minimum= %d, position - %d%n", minimum, positionMinimum);
        if (productEven !=1) {
            System.out.println("Product of all entered even numbers = " + productEven);
        }
        else {
            System.out.println("There is no even members");
        }
        reader.close();
    }
}
