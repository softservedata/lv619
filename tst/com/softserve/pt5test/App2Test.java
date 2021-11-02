package com.softserve.pt5test;

import com.softserve.pt5.App2;
import com.softserve.pt5.Employee;
import org.junit.Assert;
import org.junit.Test;

public class App2Test {

    public static Employee[] createEmployees() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Employee1", 5, 2000);
        employees[1] = new Employee("Employee2", 1, 3000);
        employees[2] = new Employee("Employee3", 5, 4000);
        employees[3] = new Employee("Employee4", 2, 5000);
        employees[4] = new Employee("Employee5", 2, 4000);
        return employees;
    }

    @Test
    public void TestDisplayEmployeeOfCertainDepartment() {
        Employee[] employees = createEmployees();
        Employee expected[] = {employees[0], employees[2]};
        Assert.assertArrayEquals(expected, App2.displayEmployeeOfCertainDepartment(employees, 5));
    }

    @Test
    public void TestArrangeWorkers() {
        Employee[] employees = createEmployees();
        Employee expected[] = {employees[3], employees[2], employees[4], employees[1], employees[0]};
        Assert.assertArrayEquals(expected, App2.arrangeWorkers(employees));
    }
}
