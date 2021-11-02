package com.softserve.hw12.task1;

public class App1 {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        Thirdthread thirdthread = new Thirdthread();
        firstThread.start();
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thirdthread.start();
    }
}

