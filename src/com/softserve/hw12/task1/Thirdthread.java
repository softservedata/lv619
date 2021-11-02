package com.softserve.hw12.task1;

public class Thirdthread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Third message");
        }
    }
}
