package com.softserve.pt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the name of the country");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Continent " + new Country(reader.readLine()).getContinent());
        reader.close();
    }
}
