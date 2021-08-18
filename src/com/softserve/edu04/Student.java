package com.softserve.edu04;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Student(String name) {
        this.name = name;
        age = 18;
    }

    public Student(int age) {
        name = "Ivan";
        this.age = age;
    }
    
    public Student() {
        name = "Ivan";
        age = 18;
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
    public String toString() {
        return "Student [name = " + name + ", age = " + age + "]";
    }
    
}
