package com.softserve.hw10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input sentence");
        String sentence = reader.readLine();
        System.out.println("longest word in the sentence");
        System.out.println(findLongestWord(sentence));
        System.out.println("The number of its letters");
        System.out.println(determineNumbersOfLatters(findLongestWord(sentence)));
        System.out.println("Second word in reverse order");
        System.out.println(reverseSecondWord(sentence));
        reader.close();

    }
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = words[0];
        int max = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static int determineNumbersOfLatters(String word) {
        return word.length();
    }

    public static String reverseSecondWord(String sentence) {
        String[] words = sentence.split(" ");
        String reversedSecondWord = "";
        words[1] = new StringBuilder(words[1]).reverse().toString();
        for (int i = 0; i < words.length; i++) {
            reversedSecondWord += words[i];
            if (i != words.length - 1) {
                reversedSecondWord += " ";
            }
        }
        return reversedSecondWord;
    }
}
