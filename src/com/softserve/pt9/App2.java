package com.softserve.pt9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Petro");
        employeeMap.put(3, "Taras");
        employeeMap.put(4, "Mykola");
        employeeMap.put(5, "Ivan");
        employeeMap.put(6, "Bogdan");
        employeeMap.put(7, "Oleg");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(employeeMap);
        System.out.println("Input ID");
        int key = Integer.parseInt(reader.readLine());
        if (employeeMap.containsKey(key)) {
            System.out.println("User name - " + employeeMap.get(key));
        }
        else {
            System.out.println("There is no Users with this ID");
        }
        System.out.println("Name");
        String name = reader.readLine();
        if (employeeMap.containsValue(name)) {
            for (Map.Entry entry: employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Users ID - " + entry.getKey());
                }
            }
        }
        else {
            System.out.println("There is no Users with this name");
        }

    }
}
