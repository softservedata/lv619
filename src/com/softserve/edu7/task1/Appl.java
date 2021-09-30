package com.softserve.edu7.task1;

public class Appl {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Pavlo", 13, "342",4000),
                new ContractEmployee("Mykola",88,678,20,140),
                new SalariedEmployee("Dmytro",15,"575",3000),
                new ContractEmployee("Petro",88,435,60,120),
                new SalariedEmployee("Oleg",44,"989",9000),
                new ContractEmployee("Orest",98,983,50,100)
        };

        for (Employee e : employees) {
            e.calculatePay();
        }
        Employee.sortEmpoloyers(employees);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
