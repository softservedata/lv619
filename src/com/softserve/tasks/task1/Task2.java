package com.softserve.tasks.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you?");
        String answer = reader.readLine();
        System.out.println("You are " + answer);
        reader.close();
    }
}