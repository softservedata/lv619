package com.softserve.pt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        System.out.println("input 1 number");
        if (Integer.parseInt(reader.readLine()) % 2 == 0) {
            counter++;
        }
        System.out.println("input 2 number");
        if (Integer.parseInt(reader.readLine()) % 2 == 0) {
            counter++;
        }
        System.out.println("input 3 number");
        if (Integer.parseInt(reader.readLine()) % 2 == 0) {
            counter++;
        }
        System.out.println("Number of odds = " + counter);
        reader.close();
    }
}
