package com.softserve.pt3;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static float TOTALSUM;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public float getBonuses() {
        return getSalary()*0.1F;
    }

    public void changeRate(int rate) {
        setRate(rate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public int getSalary() {
        return getRate()*getHours();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static float getTOTALSUM() {
        return TOTALSUM;
    }

    public static void setTOTALSUM(float TOTALSUM) {
        Employee.TOTALSUM = TOTALSUM;
    }
}
