package com.softserve.edu7.task1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int fixedSalary;

    public SalariedEmployee(String name,int id, String socialSecurityNumber, int fixedSalary) {
        super(name,id);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedSalary = fixedSalary;
    }

    public String getSocialSecurityNumber(){return socialSecurityNumber;}

    @Override
    public void calculatePay(){
        salary = fixedSalary;
        System.out.println("Salary of SalariedEmployee:" + salary);
    }
}
