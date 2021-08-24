package com.softserve.edu3;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
        totalSum += getSalary();
    }

    public Employee(String name, int rate) {
        if (!name.isEmpty() && rate >=0) {
            this.name = name;
            this.rate = rate;
            totalSum += getSalary();
        }

    }

    public Employee(String name, int rate, int hours) {
        if (!name.isEmpty() && rate >= 0 && hours >= 0) {
            this.name = name;
            this.rate = rate;
            this.hours = hours;
            totalSum += getSalary();
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }
    public void setRate(int rate) {
        if (rate >= 0) {
            this.rate = rate;
        }
    }
    public int getRate() {
        return rate;
    }
    public void setHours(int hours) {
        if (hours >= 0) {
            this.hours = hours;
        }
    }
    public int getHours() {
        return hours;
    }
    public int getSalary() {
        return hours*rate;
    }
    public int changeRate(int rate) {
        this.rate = rate;
        return getSalary();
    }
    public double getBonuses() {
        return getSalary()*0.1;
    }
    @Override
    public String toString() {
        return "Employee[Name=" + name + " rate=" + rate + " hours=" + hours + "]";
    }

}
