package com.softserve.pt13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Random;

public class App1 {
    public static int n;
    public static void main(String[] args) {
        System.out.println("input n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        System.out.println("First Task");
        random.ints(n, 0, 100).forEach(System.out::println);
        System.out.println("Second Task");
        random.ints(n, 0, 100).sorted().forEach(System.out::println);
        System.out.println("Third Task");
        System.out.println(random.ints(n, 0, 100).max());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Fourth Task");
        System.out.println("Today is " + localDateTime.getDayOfWeek());

    }
}
