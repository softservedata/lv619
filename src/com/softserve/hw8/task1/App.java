package com.softserve.hw8.task1;

public class App {
    public static void main(String[] args) {
        FullName fullName = new FullName("Ivan", "Petrov");
        Student student = new Student(fullName, 19, 4);
        FullName fullName1 = new FullName("Petro", "Ivanov");
        Student student1 = new Student(fullName1, 20, 34);
        System.out.println(student.info());
        System.out.println(student.activity());
        System.out.println(student1.info());
        System.out.println(student1.activity());
    }
}
