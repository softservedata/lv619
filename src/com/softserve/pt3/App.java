package com.softserve.pt3;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 100, 20);
        Employee employee2 = new Employee("Roman", 50, 40);
        Employee employee3 = new Employee("Petro", 25, 30);

        Employee.setTOTALSUM(employee1.getSalary() + employee1.getBonuses() +
                employee2.getSalary() + employee2.getBonuses() +
                employee3.getSalary() + employee3.getBonuses());
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total salary of all workers " + Employee.getTOTALSUM());
    }
}
