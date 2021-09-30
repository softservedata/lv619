package com.softserve.edu7.task1;

abstract public class Employee implements Payment {
    private String employeeld;
    private String name;
    private int id;
    protected int salary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getEmployeeld(){
        return employeeld;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public static void sortEmpoloyers(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for(int j = 0; j < employees.length-i-1; j++) {
                if (employees[j].salary > employees[j+1].salary) {
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Id = " + id + " name = " + name + " salary = " + salary;
    }
}
