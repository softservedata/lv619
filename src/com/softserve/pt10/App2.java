package com.softserve.pt10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input name");
        String name = reader.readLine();
        System.out.println(outputSurnameInitials(name));
        System.out.println(outputName(name));
        System.out.println(outputFullName(name));
        reader.close();

    }
    public static String outputSurnameInitials(String name) {
        String surnameInitials = "";
        String[] initials = name.split(" ");
        surnameInitials = String.format("%s %c. %c.", initials[0], initials[1].charAt(0), initials[1].charAt(0));
        return surnameInitials;
    }

    public static String outputName(String name) {
        return name.split(" ")[1];
    }

    public static String outputFullName(String name) {
        String fullName = "";
        String[] initials = name.split(" ");
        fullName = String.format("%s %s %s", initials[1], initials[2], initials[0]);
        return fullName;
    }
}
