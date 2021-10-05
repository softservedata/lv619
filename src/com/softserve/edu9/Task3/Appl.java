package com.softserve.edu9.Task3;

import java.util.ArrayList;
import java.util.List;

public class Appl {
    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("John",2));
        students.add(new Student("Mark",3));
        students.add(new Student("Mike",1));
        students.add(new Student("Kevin",2));
        students.add(new Student("Dmytro",2));
        students.add(new Student("Mark",4));

        students.sort(new Student.nameComparator());
        System.out.println("Ordered by name:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\nOrdered by course:");
        students.sort(new Student.courseComparator());
        for (Student s : students) {
            System.out.println(s);
        }


    }
}
