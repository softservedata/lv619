package com.softserve.refresh;

public class DigitSumCalculator {
    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            //TODO
            int d1 = number / 100;
            number = number - d1 * 100;
            int d2 = number / 10;
            number = number - d2 * 10;
            int d3 = number;
            return  d1 + d2 + d3;
        } else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
    }
}