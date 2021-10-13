package com.softserve.edu11;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        int a = 5, b = 8;
        try {
           double result = Calculate.div(a,b);
            System.out.printf("The result of divide %d on %d is %f\n",a,b,result);
        }catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            int a1 = readNumber(1,10);
            int a2 = readNumber(a1,100);
            int a3 = readNumber(a2,100);
            int a4 = readNumber(a3,100);
            int a5 = readNumber(a4,100);
            int a6 = readNumber(a5,100);
            int a7 = readNumber(a6,100);
            int a8 = readNumber(a7,100);
            int a9 = readNumber(a8,100);
            int a10 = readNumber(a9,100);
            System.out.println("Number is = " + a1);
            System.out.println("Number is = " + a2);
            System.out.println("Number is = " + a3);
            System.out.println("Number is = " + a4);
            System.out.println("Number is = " + a5);
            System.out.println("Number is = " + a6);
            System.out.println("Number is = " + a7);
            System.out.println("Number is = " + a8);
            System.out.println("Number is = " + a9);
            System.out.println("Number is = " + a10);
        }catch (InputMismatchException e) {
            System.out.println("Not number");
        }
    }
    public static int readNumber(int start, int end) throws InputMismatchException {
        System.out.print("Write number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number > start && number < end) return number;
        else {
            System.out.printf("Write number from %d to %d",start,end);
            number = in.nextInt();
            return number;
        }
    }
}
