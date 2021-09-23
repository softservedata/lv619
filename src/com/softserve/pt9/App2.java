package com.softserve.pt9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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
        System.out.println(findUser(employeeMap, key));
        System.out.println("Input name");
        String name = reader.readLine();
        for (String name1: findUserByName(employeeMap, name)) {
            System.out.println(name1);
        }

    }
    public static String findUser(Map<Integer, String> users,int key) {
        String result;
        if (users.containsKey(key)) {
            result = "User name - " + users.get(key);
        }
        else {
            result = "There is no Users with this ID";
        }
        return result;
    }
    public static List<String> findUserByName(Map<Integer, String> users, String name) {
        List<String> list = new LinkedList<>();
        if (users.containsValue(name)) {
            for (Map.Entry entry: users.entrySet()) {
                if (entry.getValue().equals(name)) {
                    list.add("Users ID - " + entry.getKey());
                }
            }
        }
        else {
            list.add("There is no Users with this name");
        }
        return list;
    }
}
