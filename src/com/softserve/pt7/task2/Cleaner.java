package com.softserve.pt7.task2;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        print();

    }

    @Override
    public int salary() {
        return 5000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON());
    }


    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
}