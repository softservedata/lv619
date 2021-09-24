package com.softserve.hw9.task3;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class CourseComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.getCourse() - o1.getCourse();
        }
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    public static void printStudents(List students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student =iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static List sortByName(List<Student> students) {
        students.sort(new NameComparator());
        return students;
    }

    public static List sortByCourse(List<Student> students) {
        students.sort(new CourseComparator());
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }


}
