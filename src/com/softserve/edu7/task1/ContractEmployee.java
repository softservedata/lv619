package com.softserve.edu7.task1;

public class ContractEmployee extends Employee implements Payment {
    private int federalTaxIdMember;
    private int hourlyRate;
    private int numberOfHoursWork;

    public ContractEmployee(String name,int id, int federalTaxIdMember, int hourlyRate, int numberOfHoursWork) {
        super(name, id);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWork = numberOfHoursWork;
    }

    @Override
    public void calculatePay() {
        salary = hourlyRate*numberOfHoursWork;
        System.out.println("ContractEmployee salary:" + salary);
    }

}
