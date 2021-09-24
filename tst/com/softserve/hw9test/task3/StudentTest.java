package com.softserve.hw9test.task3;

import com.softserve.hw9.task3.Student;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class StudentTest {
    public static List<Student> students = new LinkedList<>();

    @BeforeClass
    public static void beforeClass() {
        initialization();
    }


    @Test
    public void TestSortByName() {
        List<Student> expected = new LinkedList<>();
        expected.add(new Student("Ivan", 2));
        expected.add(new Student("Orest", 3));
        expected.add(new Student("Pavlo", 1));
        expected.add(new Student("Petro", 2));
        expected.add(new Student("Taras", 5));
        Assert.assertEquals(expected, students = Student.sortByName(students));
    }
    @Test
    public void TestSortByCourse() {
        List<Student> expected = new LinkedList<>();
        expected.add(new Student("Taras", 5));
        expected.add(new Student("Orest", 3));
        expected.add(new Student("Petro", 2));
        expected.add(new Student("Ivan", 2));
        expected.add(new Student("Pavlo", 1));

        Assert.assertEquals(expected, students = Student.sortByCourse(students));
    }
    static void initialization() {
        students.add(new Student("Petro", 2));
        students.add(new Student("Ivan", 2));
        students.add(new Student("Orest", 3));
        students.add(new Student("Taras", 5));
        students.add(new Student("Pavlo", 1));
    }
}
