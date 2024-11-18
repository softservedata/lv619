package com.softserve.refresh;

import java.util.Arrays;

public class PrintReverseSortedArray {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        printReverseSortedArray(array);
    }

    private static void printReverseSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int s = array[i];
                    array[i] = array[j];
                    array[j] = s;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}

