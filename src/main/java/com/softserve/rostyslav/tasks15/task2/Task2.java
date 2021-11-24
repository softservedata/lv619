package com.softserve.rostyslav.tasks15.task2;

import java.io.*;

public class Task2 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task2\\task2.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task2\\task2result.txt";

    public static void main(String[] args) throws IOException {
    /*System.out.println("Input n");
        int count = readFromConcole();*/
        int number = readFromFile();
        String result = "";
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                result += i;
                number = number/i;
                if (number % i == 0) {
                    result += "^";
                }
                else result+= ",";
            }
        }
        result = result.substring(0, result.length() - 1);
        wtiteToConcole(result);
        writeToFile(result);

    }

    public static int readFromConcole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static int readFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        return Integer.parseInt(reader.readLine());
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
