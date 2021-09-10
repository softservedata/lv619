package com.softserve.edu6.homework2;

public class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary, String position) {
        super(name,age, salary);
        this.position = position;
    }
    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Posotion: %s, Salary:  %.2f.",
                getName(),getAge(),position,getSalary());
    }
}
