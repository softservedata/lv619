package com.softserve.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App1 {

    static int [] numbersTask2 = new int[10];
    static int [] numbersTask3 = new int[5];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Task 1
        System.out.println("Input number of Mounth");
        System.out.println("Number of days in this Mounth will be "
                + task1(Integer.parseInt(reader.readLine())) );
        //Task 2
        for (int i = 0; i < numbersTask2.length; i++) {
            System.out.format("Enter %d number%n", i + 1);
            numbersTask2[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(numbersTask2));
        System.out.println(task2(numbersTask2));
        //Task 3;
        for (int i = 0; i < numbersTask3.length; i++) {
            System.out.format("Enter %d number%n", i + 1);
            numbersTask3[i] = Integer.parseInt(reader.readLine());
            if (numbersTask3[i] < 0) {
                break;
            }
        }
        task3(numbersTask3);
    }
    public static int task1(int i) {
        int [] numberOfDays =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return numberOfDays[i - 1];

    }
    public static String task2(int[] numbers) {
        String result;
        int sum = 0;
        int product = 1;
        boolean check = true;
        for (int i = 0; i < numbers.length; i++) {
            if (i < 5) {
                sum += numbers[i];
                if (numbers[i] < 0) {
                    check = false;
                }
            }
            else product *= numbers[i];
        }
        if (check) {
            result = "Sum of first 5 elements " + sum;
        }
        else {
            result = "Product of last 5 element " + product;
        }
        return result;
    }
    public static void task3(int[] a) {
        int positionOfSecondPositiveNumber = possitionOfSDPositive(a);
        int productEven = productEven(a);
        int [] position = minimumOfArray(a);
        System.out.println(Arrays.toString(finalArray(a)));
        if (positionOfSecondPositiveNumber < 1) {
            System.out.println("There is no two positive nubers in array");
        }
        else {
            System.out.println("Position of second positive number " + (positionOfSecondPositiveNumber + 1));
        }
        System.out.format("Minimum= %d, position - %d%n", position[0], position[1] + 1);
        if (productEven !=1) {
            System.out.println("Product of all entered even numbers = " + productEven);
        }
        else {
            System.out.println("There is no even members");
        }

    }
    public static int possitionOfNegative(int[] numbers) {
        int position = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                position = i;
            }
        }
        return position;
    }
    public static int possitionOfSDPositive(int[] numbers) {
        int position = 0;
        int check = 0;
        for (int i = 0; i < possitionOfNegative(numbers); i++) {
            if (numbers[i] > 0) {
                position = i;
                check++;
                if (check == 2) {
                    break;
                }
            }
        }
        if (check == 2) {
            return position;
        }
        else {
            return 0;
        }
    }
    public static int[] minimumOfArray(int[] numbers) {
        int[] minimum = new int[2];
        minimum[0] = numbers[0];
        for (int i = 0; i < possitionOfNegative(numbers); i++) {
            if (numbers[i] < minimum[0]) {
                minimum[0] = numbers[i];
                minimum[1] = i;
            }
        }
        return minimum;
    }
    public static int productEven(int[] numbers) {
        int product = 1;
        for (int i = 0; i < possitionOfNegative(numbers); i++) {
            if (numbers[i] % 2 == 0) {
                product*= numbers[i];
            }
        }
        return product;
    }
    public static int[] finalArray(int [] numbers) {
        int [] a = new int[possitionOfNegative(numbers)];
        if (possitionOfNegative(numbers) >= 0) System.arraycopy(numbers, 0, a, 0, possitionOfNegative(numbers));
        return a;
    }
}
