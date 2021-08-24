package com.softserve.edu3;

public class App {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan",5,100);
        Employee petro = new Employee("Petro",8,350);
        Employee stepan = new Employee("Stepan",6,400);
        System.out.println(stepan);
        System.out.println(ivan);
        System.out.println(petro);
        System.out.println("total salary = " + Employee.totalSum);
        //
        System.out.println("-------------------------------");
        //
        Person mykola = new Person();
        Person bohdan = new Person();
        Person oleh = new Person();
        Person taras = new Person();
        Person vlad = new Person();
        mykola.input();
        bohdan.input();
        oleh.input();
        taras.input();
        vlad.input();
        mykola.output();
        bohdan.output();
        oleh.output();
        taras.output();
        vlad.output();
    }
}
