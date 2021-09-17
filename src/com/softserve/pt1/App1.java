package com.softserve.pt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input A");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Input B");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("A+B=" + (a + b));
        System.out.println("A-B=" + (a - b));
        System.out.println("A*B=" + (a * b));
        System.out.println("A/B=" + (a / b));
        reader.close();
    }
}
