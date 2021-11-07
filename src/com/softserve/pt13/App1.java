package com.softserve.pt13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
        System.out.println("Fifth Task");
        findFirstMonday(localDateTime);
        System.out.println("Sixth Task");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println("Unsorted list");
        System.out.println(numbers);
        System.out.println("Sorted list");
        System.out.println(sortList(numbers));
    }

    public static void findFirstMonday(LocalDateTime localDateTime) {
        int dayOfMounth = 0;
        do {
            dayOfMounth++;
            localDateTime = LocalDateTime.of(localDateTime.getYear(), localDateTime.getMonth(), dayOfMounth,
                    localDateTime.getHour(), localDateTime.getMinute());
        }
        while (!localDateTime.getDayOfWeek().equals(DayOfWeek.MONDAY));
        System.out.println("First Monday " + localDateTime.getDayOfMonth() + " of " + localDateTime.getMonth());
    }
    public static List<Integer> sortList(List<Integer> numbers){
        return numbers.stream().sorted(Comparator.comparingInt(s -> s)).collect(Collectors.toList());
    }
}
