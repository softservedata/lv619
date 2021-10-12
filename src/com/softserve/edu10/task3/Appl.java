package com.softserve.edu10.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {
        String text = new String("");
        Scanner in = new Scanner(System.in);
        text = in.nextLine();
        Pattern pattern = Pattern.compile("(\\u0024?\\d+\\u002E?\\d{2})");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
