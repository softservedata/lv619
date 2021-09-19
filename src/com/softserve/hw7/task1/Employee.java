package com.softserve.hw7.task1;

public abstract class Employee implements Payment {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeld() {
        return employeeId;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeId = employeeld;
    }
}
