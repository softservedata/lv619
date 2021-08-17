package com.sofserve.hw1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {

    public static void main(String[] args) throws IOException {
        System.out.println("What is Your name?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = reader.readLine();
        System.out.println(name + "," + address);
        reader.close();
    }
}
