package com.softserve.refresh;

public class Leetspeak extends Encoder{

    public String encode(String source){
        if (source.equals(null)) {
            return "";
        }
        String result = source.replace("A", "4");
        result = result.replace("a", "4");
        result = result.replace("E", "3");
        result = result.replace("e", "3");
        result = result.replace("L", "1");
        result = result.replace("l", "1");
        result = result.replace("M", "/^^\\");
        result = result.replace("m", "/^^\\");
        result = result.replace("O", "0");
        result = result.replace("o", "0");
        result = result.replace("U", "(_)");
        result = result.replace("u", "(_)");
        return result;
    }

}

abstract class Encoder{
    public abstract String encode(String source);
}