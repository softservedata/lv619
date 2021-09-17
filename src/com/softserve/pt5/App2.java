package com.softserve.pt5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class App2 {
    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Employee1", 5, 2000);
        employees[1] = new Employee("Employee2", 1, 3000);
        employees[2] = new Employee("Employee3", 5, 4000);
        employees[3] = new Employee("Employee4", 2, 5000);
        employees[4] = new Employee("Employee5", 2, 4000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.toString(employees));
        System.out.println("Input number of Department");
        System.out.println
                (Arrays.toString(displayEmployeeOfCertainDepartment(employees, Integer.parseInt(reader.readLine()))));
        System.out.println("Arranged workers by the field salary in descending order");
        System.out.println(Arrays.toString(arrangeWorkers(employees)));

    }

    public static Employee[] displayEmployeeOfCertainDepartment(Employee[] employees, int number) {
        Employee EmployeesOfCeratainDepartment[] = new Employee[number];
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment_number() == number) {
                EmployeesOfCeratainDepartment[counter] = employees[i];
                counter ++;
            }
        }
        return Arrays.copyOfRange(EmployeesOfCeratainDepartment, 0, counter);
    }
    public static Employee[] arrangeWorkers(Employee[] employee) {
         Arrays.sort(employee, new Comparator<Employee>() {
             @Override
             public int compare(Employee o1, Employee o2) {
                 return -(o1.getSalary() - o2.getSalary());
             }
         });
         return employee;
    }
}
