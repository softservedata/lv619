package com.softserve.pt12.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class App3 {
    public static String fileName = "mytext.txt";
    public static void main(String[] args) {
        List<String> fileLines = new LinkedList<>();
        fileLines = readFile(fileName);
        System.out.println(fileLines);
    }
    public static List<String> readFile(String fileName) {
        List<String> fileLines = new LinkedList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (reader.ready()) {
                fileLines.add(reader.readLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileLines;
    }
}
