package com.softserve.rostyslav.tasks15.task1;


import java.io.*;

public class Task1 {
    public static String fileName1 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task1\\task1.txt";
    public static String fileName2 = ".\\src\\main\\java\\com\\softserve\\rostyslav\\tasks15\\task1\\task1result.txt";
    public static void main(String[] args) throws IOException {

        String fibonacciSequence = "1 1 ";
        int f1 = 1;
        int f2 = 1;
        /*System.out.println("Input n");
        int count = readFromConcole();*/
        int count = readFromFile();
        for (int i = 0; i < count - 2; i++) {
            int f3 = f1 + f2;
            fibonacciSequence = fibonacciSequence + f3 + " ";
            f1 = f2;
            f2 = f3;
        }
        wtiteToConcole(fibonacciSequence);
        writeToFile(fibonacciSequence);

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
        //writer.flush();
        writer.close();
    }
}
