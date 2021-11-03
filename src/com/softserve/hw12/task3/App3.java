package com.softserve.hw12.task3;

public class App3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadOne());
        thread.start();
    }
}
