package com.softserve.edu9.Task3;

import java.util.Comparator;
import java.util.Formatter;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static class nameComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.compareTo(s2);
        }
    }

    public static class courseComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.course - s2.course;
        }
    }

    @Override
    public int compareTo(Student obj) {
        if (this.name.compareTo(obj.name) != 0) {
            return this.name.compareTo(obj.name);
        } else {
            return this.course - obj.course;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb);
        f.format("Name:%s, Cource:%d",name,course);
        return sb.toString();
    }

    public void printStudents(List<Student> list, Integer course) {
        for (Student s : list) {
            if (s.course == course) {
                System.out.printf("Name:%s, Course:%d",s.name, s.course);
            }
        }
    }
}