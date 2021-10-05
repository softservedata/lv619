package com.softserve.edu15io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputData {
    public static void main(String[] args) {
        String fileName = "d:/test.txt";
        FileInputStream inFile;
        int k = -1;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            while ((k = inFile.read()) > 0) {
                System.out.print((char) k);
            }
            inFile.close();
            System.out.println("\nInput stream was closed.");
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }
    }
}
