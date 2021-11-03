package com.softserve.hw12.task2;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        synchronized (App2.monitor) {
            System.out.println("Thread2 start");
            while (App2.i == 1) {
                App2.i --;
                App2.monitor.notifyAll();
                try {
                    App2.monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread2 end");
        }
    }
}
