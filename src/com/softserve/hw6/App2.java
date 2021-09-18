package com.softserve.hw6;

public class App2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Petro",40, 32000);
        Employee developer = new Developer("Taras", 32, 32735.35, "Average Java developer" );
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
