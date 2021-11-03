package com.softserve.hw12.task3;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number Two");
        }
        Thread thread3 = new Thread(new ThreadThree());
        thread3.start();
    }
}
