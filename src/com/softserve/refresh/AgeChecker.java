package com.softserve.refresh;

public class AgeChecker {
    public static String checkIfAdult(int age) {
        if (age <= 0) return "Invalid age. Age must be a positive number.";
        if (age > 150) return "Invalid age. Age must not exceed 150 years.";
        if (age >= 18) return "You are an adult.";
        else {
            return "You are not an adult.";
        }
    }
}
