package com.softserve.rostyslav.tasks15.task3;

import java.io.*;

public class Task3 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task3\\task3.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task3\\task3result.txt";
    public static void main(String[] args) throws IOException {
        /*System.out.println("Input cost of dollar");
        double cost = readFromConcole();
        System.out.println("Input sum of money in gryvna");
        double sum = readFromConcole();*/
        String [] line = readFromFile().split(" ");

        double cost = Double.parseDouble(line[0]);
        double sum = Double.parseDouble(line[1]);
        double result = sum/cost;
        wtiteToConcole(result + "");
        writeToFile(result + "");

    }

    public static int readFromConcole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
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
