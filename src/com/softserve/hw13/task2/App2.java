package com.softserve.hw13.task2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        System.out.println(encrypt("xyz", 3));

    }
    public static String encrypt(String s, int n){
        byte [] letters = s.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < letters.length; i++) {
            letters[i] += n;
            if (letters[i] > 122) {
                letters[i] -= 26;
            }
        }
        return new String(letters);
    }
    public static String decrypt(String s, int n){
        return s;
    }

}
