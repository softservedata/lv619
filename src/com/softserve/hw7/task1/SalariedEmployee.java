package com.softserve.hw7.task1;

import java.util.Objects;

public class SalariedEmployee extends Employee implements Payment{
    private String name;
    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber,
                            int hourlyRate, int numberOfHoursWorked) {
        super(employeeId);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return getHourlyRate()*getNumberOfHoursWorked();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalariedEmployee)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return getHourlyRate() == that.getHourlyRate() && getNumberOfHoursWorked() == that.getNumberOfHoursWorked() && getName().equals(that.getName()) && getSocialSecurityNumber().equals(that.getSocialSecurityNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSocialSecurityNumber(), getHourlyRate(), getNumberOfHoursWorked());
    }
}
