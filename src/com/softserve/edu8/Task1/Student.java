package com.softserve.edu8.Task1;

import java.util.Formatter;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName,age);
        this.course = course;
    }

    @Override
    public String activity() {
       return  "Studying at university";
    }

    @Override
    public String info() {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb);
        f.format("FirstName:%s, LastName:%s, Age:%d, Course:%d",getFullName().getFistname(),getFullName().getLastname(),getAge(),course);
        return sb.toString();
    }
}
