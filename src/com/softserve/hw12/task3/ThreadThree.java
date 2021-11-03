package com.softserve.hw12.task3;

public class ThreadThree implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number Three");
        }
    }
}
