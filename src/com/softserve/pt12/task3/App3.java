package com.softserve.pt12.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App3 {
    public static String fileName = "D:\\lv619\\src\\com\\softserve\\pt12\\task3\\mytext.txt";
    public static String[] lines;
    public static void main(String[] args) {
        List<String> fileLines = new LinkedList<>();
        fileLines = readFile(fileName);
        lines = fileLines.toArray(new String[fileLines.size()]);
        countSymbolsInLine(lines);
        findLongestLine(lines);
        findVar(lines);
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
    public static void countSymbolsInLine(String [] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.printf("Number symbols in %d line = %d%n",i + 1, lines[i].length());
        }
    }
    public static void findLongestLine(String [] lines) {
        int max = lines[0].length();
        int maxNumber = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() > max) {
                max = lines[i].length();
                maxNumber = i;
            }
        }
        System.out.println("Longest line is number " + (maxNumber + 1));
    }

    public static void findVar(String [] lines){
        Pattern pattern = Pattern.compile("\\bvar|\\bVar");
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            matcher.reset();
            while (matcher.find()) {
                System.out.println(line);
                break;
            }
        }
    }
}
