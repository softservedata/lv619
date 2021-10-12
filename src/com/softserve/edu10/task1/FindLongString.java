package com.softserve.edu10.task1;

public class FindLongString {
    private final String sentense;

    public FindLongString(String sentense) {
        this.sentense = sentense;
    }
    public String getSentense() {
        return sentense;
    }
    public String findLongString() {
        String[] strings = sentense.split(" ");
        String logestString = "";
        int lenght = 0;
        for(String string : strings) {
            if (string.length() > lenght) {
                lenght = string.length();
                logestString = string;
            }
        }
        return logestString;
    }
    public String reserveWord(int position) {
        String[] strings = sentense.split(" ");
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < strings.length; i++) {
            if (i == position) {
                string.append(strings[i]);
            }
        }
        return string.reverse().toString();
    }
}
