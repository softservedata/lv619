package com.softserve.rostyslav.tasks15.task7;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task7\\task7.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task7\\task7result.txt";
    public static void main(String[] args) throws IOException {
        /*System.out.println("Input line");
        line cost = readFromConcole();
        */
        int number = Integer.parseInt(readFromFile());
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result *= i;
        }

        wtiteToConcole(result + "");
        writeToFile(result + "");

    }

    public static String readFromConcole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static String readFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        return reader.readLine();
    }

    public static void wtiteToConcole(String result) throws IOException {
        System.out.println(result);
    }

    public static void writeToFile(String result) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
        writer.write(result);
        writer.close();
    }
}
