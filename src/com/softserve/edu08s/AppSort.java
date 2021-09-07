package com.softserve.edu08s;

import java.util.Arrays;
import java.util.Comparator;

public class AppSort {
    public static void main(String[] args) {
        /*-
        int[] x = new int[10];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(10);
        }
        System.out.println("Origin Arrays = " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("Sorted Arrays = " + Arrays.toString(x));
        */
        //
        Student[] students = new Student[5];
        students[0] = new Student("Oksana", 52645);
        students[1] = new Student("Bogdan", 97765);
        students[2] = new Student("Bogdan", 98765);
        students[3] = new Student("Bogdan", 96765);
        students[4] = new Student("Orest", 1354);
        System.out.println("Origin Arrays = " + Arrays.toString(students));
        //
        //Arrays.sort(students, new Student.NameComparator());
        //
        Arrays.sort(students, new Comparator<Student>() {
                public int compare(Student st1, Student st2) {
                    return -st1.getName().compareTo(st2.getName());
                }
            }
        );
        //
        System.out.println("Sorted Arrays = " + Arrays.toString(students));
    }

}
