package com.softserve.add;

import java.util.Arrays;

public class App6 {
    public static void main(String[] args) {
        int [] a = {2, 2, 3, 2};
        int n = findNumber(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Position - " + n);
    }
    public static int findNumber(int[] numbers) {
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            int counter = 0;
            for (int number : numbers) {
                if (numbers[i] != number) {
                    counter++;
                }
                if (counter == 2) {
                    position = i;
                    break;
                }
            }
        }
        return position;
    }
}
