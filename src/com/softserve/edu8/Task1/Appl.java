package com.softserve.edu8.Task1;

public class Appl {
    public static void main(String[] args) {
        Person student1 = new Student(new FullName("Petro","Ivanov"),19,3);
        Person student2 = new Student(new FullName("Ivan","Petrov"),17,1);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

    }
}
