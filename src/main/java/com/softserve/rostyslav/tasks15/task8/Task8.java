package com.softserve.rostyslav.tasks15.task8;

import java.io.*;

public class Task8 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task8\\task8.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task8\\task8result.txt";
    public static void main(String[] args) throws IOException {
        /*System.out.println("Input line");
        line cost = readFromConcole();
        */
        String line = readFromFile();
        int result = 0;

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
