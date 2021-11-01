package com.softserve.pt12.task2;

public class App2 {
    public static void main(String[] args) {
        PeaceThread peaceThread = new PeaceThread();
        HelloThread helloThread = new HelloThread();
        helloThread.start();
        peaceThread.start();
        try {
            helloThread.join();
            peaceThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is …");
    }
}
