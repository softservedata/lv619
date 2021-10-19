package com.softserve.tasks.task3;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Yevhen", 100, 24);
        Employee employee2 = new Employee("Bohdan", 75, 30);
        Employee employee3 = new Employee("Oleg", 50, 36);

        Employee.setTOTALSUM(employee1.getSalary() + employee1.getBonuses() +
                employee2.getSalary() + employee2.getBonuses() +
                employee3.getSalary() + employee3.getBonuses());
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total salary of all workers " + Employee.getTOTALSUM());
    }
}