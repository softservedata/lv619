package com.softserve.rostyslav.tasks15.task5;

import java.io.*;
import java.util.Locale;

public class Task5 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task5\\task5.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task5\\task5result.txt";
    public static void main(String[] args) throws IOException {
        /*System.out.println("Input line");
        line line = readFromConcole();
        */
        String line = readFromFile();
        String reverseLine = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            reverseLine += line.charAt(i);
        }
        String result = "";
        if (reverseLine.toLowerCase().equals(line.toLowerCase())) {
            result = "true";
        }
        else {
            result = "false";
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
