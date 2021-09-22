package com.softserve.hw8.task2;

public class App {
    public static void main(String[] args) {
        Wrapper<Integer> wrapper = new Wrapper<Integer>(5);
        Wrapper<String> wrapper1 = new Wrapper<String>("wrapper");
        Wrapper<Boolean> wrapper2 = new Wrapper<Boolean>(false);
        System.out.println(wrapper.getValue());
        System.out.println(wrapper1.getValue());
        System.out.println(wrapper2.getValue());
    }
}
