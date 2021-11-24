package com.softserve.pt14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        try {
            testWord = br.readLine();
        System.out.println("Input character");
        String character1 = br.readLine();
        for (int i = 0; i < testWord.length(); i++) {
            if (i < testWord.length() - 1) {
                character = testWord.substring(i, i + 1);
            }
            else {
                character = testWord.substring(i);
            }
            if (character.equals(character1)) countCharacters++;
        }
        System.out.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
