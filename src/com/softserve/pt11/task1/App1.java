package com.softserve.pt11.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App1 {
    static int a;
    static int b;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input a");
        try {
            a = Integer.parseInt(reader.readLine());
            System.out.println("input b");
            b = Integer.parseInt(reader.readLine());
            reader.close();
        }
        catch (Exception e) {
            System.out.println("wrong input");
        }
        try {
            System.out.println("Area = " + squareRectangle(a,b));
        } catch (NegativeValueExeption e) {
            System.out.println("a or b have negative values");
        }
    }

    public static int squareRectangle (int a, int b) throws NegativeValueExeption{
        if (a <= 0 || b <= 0) {
            throw new NegativeValueExeption();
        }
        return a * b;
    }
}
