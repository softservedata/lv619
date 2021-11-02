package com.softserve.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {

    public static void main(String[] args)  {
        System.out.println("What is Your name?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            System.out.println("Where are you live, " + name + "?");
            String address = reader.readLine();
            System.out.println(name + "," + address);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
