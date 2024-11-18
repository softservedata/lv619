package com.softserve.refresh;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {12, -20, 35, 64, -5, -60, 17, 32, 84, 100};
        System.out.println("The sum of the array elements is: " + calculateSum(array));
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int a: array) {
            sum += a;
        }
        return sum;
    }
}
