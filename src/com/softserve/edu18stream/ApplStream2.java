package com.softserve.edu18stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplStream2 {

    public static void main(String[] args) {
        /*-
        List<Integer> lst = new Random().ints()
            .limit(10)
            .sorted()
            //.forEach(System.out::println);
            .boxed()
            .collect(Collectors.toList());
        System.out.println(lst);
        */
        /*-
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<String> squaresList = numbers.stream()
                .distinct()
                .map(i -> String.valueOf(i * i) + "*")
                .collect(Collectors.toList());
        squaresList.forEach(System.out::print);
        */
        /*-
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Map<String, String> squaresMap = numbers.stream()
                .distinct()
                .map(i -> String.valueOf(i) +"*="+ String.valueOf(i * i))
                .collect(Collectors.toMap(s -> s.substring(0,1),
                        s -> s.substring(1)));
        squaresMap.forEach((key, value) -> System.out.print("\n" + key + ": " + value));
        */
        // /*-
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        long count = numbers.stream()
                .filter(num -> num > 2)
                .count();
        System.out.println("\ncount = " + count);
        // */
    }
}
