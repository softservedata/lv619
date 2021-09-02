package com.softserve.edu08s;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    
    public static class NameComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
            /*-
            return st1.getName().compareTo(st2.getName()) == 0
                    ? st1.getAge() - st2.getAge()
                    : st1.getName().compareTo(st2.getName());
            */
        }
    }
    
    public static class AgeComparator implements Comparator<Student> {
        public int compare(Student st1, Student st2) {
            return st1.getAge() - st2.getAge();
        }
    }
    
    
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Student other = (Student) obj;
        if ((age != other.age) || (name == null) && (other.name != null) || (name != null) && (other.name == null)) {
            return false;
        }
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }

    public int compareTo(Student obj) {
        //return name.compareTo(obj.name);
        //return age - obj.age;
        return getAge() - obj.getAge();
    }

    @Override
    public String toString() {
        return "\nStudent [name=" + name + ", age=" + age + "]";
    }

}
