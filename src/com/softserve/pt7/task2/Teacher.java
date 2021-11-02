package com.softserve.pt7.task2;

public class Teacher extends Staff{
    private final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        print();

    }

    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON());
    }


    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
}
