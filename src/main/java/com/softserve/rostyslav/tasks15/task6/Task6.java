package com.softserve.rostyslav.tasks15.task6;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task6\\task6.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task6\\task6result.txt";
    public static void main(String[] args) throws IOException {
        /*System.out.println("Input line");
        line cost = readFromConcole();
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
