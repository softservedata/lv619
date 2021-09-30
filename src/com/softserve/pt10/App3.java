package com.softserve.pt10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App3 {
    public static void main(String[] args) {
        String name1 = "+56fgfgf";
        String name2 = "_56fgfgf";
        String name3 = "A56fgI5f";
        String name4 = "+56As";
        String name5 = "_Nmmm_";
        System.out.println(name1 + " " + checkValid(name1));
        System.out.println(name2 + " " + checkValid(name2));
        System.out.println(name3 + " " + checkValid(name3));
        System.out.println(name4 + " " + checkValid(name4));
        System.out.println(name5 + " " + checkValid(name5));

    }
    public static boolean checkValid(String userName){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }
}
