package com.softserve.hw13.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App3 {
    public static void main(String[] args) {
        System.out.println(isValid("mm.22.22"));

    }
    public static boolean isValid(String dateStr) {
        Pattern pattern = Pattern.compile("([0-9]{2}.[0-9]{2}.[0-9]{2})");
        Matcher matcher = pattern.matcher(dateStr);
        return matcher.find();
    }
}
