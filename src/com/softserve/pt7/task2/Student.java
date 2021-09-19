package com.softserve.pt7.task2;

public class Student extends Person{
    private final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        print();
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON());
    }


    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
}
