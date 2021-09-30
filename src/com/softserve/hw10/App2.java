package com.softserve.hw10;

public class App2 {
    public static void main(String[] args) {
        String sentence = "I    am      learning     Java   Core";
        System.out.println(sentence);
        System.out.println(convertAllSpaces(sentence));

    }
    public static String convertAllSpaces(String sentence) {
        return sentence.replaceAll("[ ]{2,}", " ");
    }
}
