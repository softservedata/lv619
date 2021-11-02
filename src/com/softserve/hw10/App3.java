package com.softserve.hw10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = null;
        try {
            sentence = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> dollars = findPattern(sentence);
        for (String dollar: dollars) {
            System.out.println(dollar);
        }
    }
    public static List<String> findPattern(String sentence){
        List<String> patterns = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\$[0-9]+.[0-9]{2})\\b");
        Matcher matcher = pattern.matcher(sentence);
        matcher.reset();
        while (matcher.find()) {
            patterns.add(sentence.substring(matcher.start(), matcher.end()));
        }
        return patterns;
    }
}
