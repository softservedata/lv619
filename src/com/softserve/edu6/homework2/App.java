package com.softserve.edu6.homework2;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Bob",35,15000),
                new Developer("Peter",39,35000,"Junior java developer"),
                new Developer("John",21,18000,"Junior python developer")
        };
        for(Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
