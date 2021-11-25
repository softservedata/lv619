package com.softserve.rostyslav.tasks15.task4;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task4 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task4\\task4.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task4\\task4result.txt";
    public static void main(String[] args) throws IOException {
        /*System.out.println("Input line");
        line line = readFromConcole();
        */
        String line = readFromFile();
        int result = 0;
        String pattern = "[aeiouy]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line.toLowerCase());
        while (m.find()) {
            result++;
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
