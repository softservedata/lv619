package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a and b");
        System.out.println(findDivisor(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())));
        reader.close();
    }
    public static int findDivisor(int a, int b) {
        int divisor = 1;
        int max;
        if (a > b) {
            max = a;
        }
        else {
            max = b;
        }
        for (int i = 1; i < max; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                divisor = i;
            }
        }
        return divisor;
    }
}
