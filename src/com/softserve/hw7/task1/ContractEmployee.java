package com.softserve.hw7.task1;

import java.util.Objects;

public class ContractEmployee extends Employee implements Payment {
    private String name;
    private String federalTaxIdMember ;
    private int FixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, int fixedMonthlyPayment) {
        super(employeeId);
        this.name = name;
        this.federalTaxIdMember = federalTaxIdMember;
        FixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return getFixedMonthlyPayment();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getFixedMonthlyPayment() {
        return FixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        FixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", FixedMonthlyPayment=" + FixedMonthlyPayment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractEmployee)) return false;
        ContractEmployee that = (ContractEmployee) o;
        return getFixedMonthlyPayment() == that.getFixedMonthlyPayment() && getName().equals(that.getName()) && getFederalTaxIdMember().equals(that.getFederalTaxIdMember());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFederalTaxIdMember(), getFixedMonthlyPayment());
    }
}
