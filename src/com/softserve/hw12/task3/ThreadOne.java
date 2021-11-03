package com.softserve.hw12.task3;

public class ThreadOne implements Runnable{
    @Override
    public void run() {
        Thread thread2 = new Thread(new ThreadTwo());
        thread2.start();
    }
}
