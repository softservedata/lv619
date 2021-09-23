package com.softserve.hw9.task3;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static List<Student> students = new LinkedList<>();
    public static void main(String[] args) {
        initialization();
        Student.printStudents(students, 2);

    }
    static void initialization() {
        students.add(new Student("Petro", 2));
        students.add(new Student("Ivan", 2));
        students.add(new Student("Orest", 3));
        students.add(new Student("Taras", 5));
        students.add(new Student("Pavlo", 1));
    }
}
