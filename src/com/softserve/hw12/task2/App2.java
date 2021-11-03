package com.softserve.hw12.task2;

public class App2 {
    public static Object monitor = new Object();
    public static int i = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (monitor) {
            i = 5;
            monitor.notifyAll();
        }
        System.out.println("End of main");
    }
}
