package com.softserve.hw7.task1;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static Employee[] employees = new Employee[4];
    public static void main(String[] args) {
        initialization();
        arrangeWorkers(employees);
        for (Employee employee: employees) {
            System.out.println(employee.toString() + " average monthly wage " + employee.calculatePay());
        }

    }
    public static void initialization() {
        employees[0] = new SalariedEmployee("Id1", "Petro", "1", 200, 40);
        employees[1] = new SalariedEmployee("Id2", "Ivan", "2", 600, 20);
        employees[2] = new ContractEmployee("Id3", "Vasyl", "3", 9000);
        employees[3] = new ContractEmployee("Id4", "Taras", "4", 5000);
    }

    public static Employee[] arrangeWorkers(Employee[] employees) {
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.calculatePay() - o1.calculatePay();
            }
        });
        return employees;
    }
}