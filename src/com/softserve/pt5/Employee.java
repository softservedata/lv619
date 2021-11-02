package com.softserve.pt5;

import java.util.Objects;

public class Employee {
    private String name;
    private int department_number, salary;

    public Employee(String name, int department_number, int salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getDepartment_number() == employee.getDepartment_number() && getSalary() == employee.getSalary() && getName().equals(employee.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department_number=" + department_number +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment_number(), getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
