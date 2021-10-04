package com.softserve.edu8.Task1;

import java.util.Formatter;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract String activity();

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb);
        f.format("FirstName:%s, LastName:%s, Age:%d",fullName.getFistname(),fullName.getLastname(),age);
        return sb.toString();
    }

}
