package com.softserve.edu10.task2;

public class ConvertSpace {
    private final String sentense;

    public ConvertSpace(String sentense) {
        this.sentense = sentense;
    }

    public String getSentense() {
        return sentense;
    }

    public String convertSpaces() {
        return sentense.trim().replaceAll(" +", " ");
    }
}
