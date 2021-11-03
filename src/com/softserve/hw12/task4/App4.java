package com.softserve.hw12.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App4 {
    public static String fileName = ".\\src\\com\\softserve\\hw12\\task4\\file1.txt";
    public static String fileName2 = ".\\src\\com\\softserve\\hw12\\task4\\file2.txt";
    public static String[] lines;
    public static List<String> results = new ArrayList<>();
    public static void main(String[] args) {
        List<String> fileLines = readFile(fileName);
        lines = fileLines.toArray(new String[fileLines.size()]);
        results.add("Number of lines = " + lines.length);
        results.add("The longest line is number " + findLongestLine(lines));
        findName(lines);
        findDateofBirth(lines);
        writefile(fileName2, results);
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

    public static void writefile(String fileName, List<String> result) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String line : result) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findLongestLine(String [] lines) {
        int max = lines[0].length();
        int maxNumber = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() > max) {
                max = lines[i].length();
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static void findName(String[] lines) {
        for (String line :lines) {
            if (line.toLowerCase().startsWith("name")) {
                results.add(line);
                return;
            }
        }
    }

    public static void findDateofBirth(String[] lines) {
        for (String line :lines) {
            if (line.toLowerCase().startsWith("date of birth")) {
                results.add(line);
                return;
            }
        }
    }
}
