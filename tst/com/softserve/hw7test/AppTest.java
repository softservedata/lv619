package com.softserve.hw7test;

import com.softserve.hw7.task1.App;
import com.softserve.hw7.task1.ContractEmployee;
import com.softserve.hw7.task1.Employee;
import com.softserve.hw7.task1.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void TestArrangeWorkers() {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("Id1", "Petro", "1", 200, 40);
        employees[1] = new SalariedEmployee("Id2", "Ivan", "2", 600, 20);
        employees[2] = new ContractEmployee("Id3", "Vasyl", "3", 9000);
        employees[3] = new ContractEmployee("Id4", "Taras", "4", 5000);
        Employee[] expected = {employees[1], employees[2], employees[0], employees[3]};
        Assert.assertArrayEquals(expected, App.arrangeWorkers(employees));
        }
}
