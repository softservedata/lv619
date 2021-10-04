package com.softserve.edu8.Task2;

public class Appl {
    public static void main(String[] args) {
        Wrapper<Integer> Iwrapper = new Wrapper<>(5);
        Wrapper<String> SWrapper = new Wrapper<>("Java Core");
        Wrapper<Boolean> BWrapper = new Wrapper<>(true);
        System.out.println(Iwrapper.getValue());
        System.out.println(SWrapper.getValue());
        System.out.println(BWrapper.getValue());
    }
}
