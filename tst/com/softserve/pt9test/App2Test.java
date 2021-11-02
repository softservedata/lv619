package com.softserve.pt9test;

import com.softserve.pt9.App2;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App2Test {
    @Test
    public void TestFindUser() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Petro");
        employeeMap.put(3, "Taras");
        employeeMap.put(4, "Mykola");
        employeeMap.put(5, "Ivan");

        String expected = "User name - Mykola";
        Assert.assertEquals(expected, App2.findUser(employeeMap, 4));
    }

    @Test
    public void TestFindUserByName() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "Petro");
        employeeMap.put(3, "Taras");
        employeeMap.put(4, "Mykola");
        employeeMap.put(5, "Ivan");

        List<String> expected = new LinkedList<>();
        expected.add("Users ID - 1");
        expected.add("Users ID - 5");
        Assert.assertEquals(expected, App2.findUserByName(employeeMap, "Ivan"));
    }
}
