package com.softserve.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Year");
        System.out.println("Century " + countCentury(Integer.parseInt(reader.readLine())));
    }

    public static int countCentury(int year) {
        if(year % 100 != 0) {
            return year/100 + 1;
        }
        else return year/100;
    }
}
