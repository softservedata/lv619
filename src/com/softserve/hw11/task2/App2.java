package com.softserve.hw11.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App2 {
    public static int start =1;
    public static int end = 100;
    public static int[] numbers = new int[12];
    public static void main(String[] args) {
        numbers[0] = start;
        numbers[11] = end;
        for (int i = 1; i <= 10; i++) {
            try {
                numbers[i] = readNumber(start, end);
            } catch (OutOfRangeException e) {
                System.out.println("Number is out of bounce");
                break;
            }
            start = numbers[i];
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static int readNumber(int start, int end) throws OutOfRangeException {
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("Input number between %d and %d %n", start, end);
            number = Integer.parseInt(reader.readLine());
            }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (number < start || number > end)  {
            throw new OutOfRangeException();
        }
        return number;
    }
}
