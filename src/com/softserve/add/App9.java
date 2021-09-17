package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n");
        System.out.println("Value = " + findValue(Integer.parseInt(reader.readLine())));
        reader.close();
    }
    public static double findValue(int n) {
        double value = Math.cos(n);
        for (int i = n; i > 1; i--) {
            value = Math.cos((i - 1) + value);
        }
        return value;
    }
}
