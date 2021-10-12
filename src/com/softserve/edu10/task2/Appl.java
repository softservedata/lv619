package com.softserve.edu10.task2;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        String string;
        Scanner in = new Scanner(System.in);
        System.out.print("Write sentense: ");
        string = in.nextLine();
        ConvertSpace c = new ConvertSpace(string);
        System.out.println("Converted space: " + c.convertSpaces());
    }
}
