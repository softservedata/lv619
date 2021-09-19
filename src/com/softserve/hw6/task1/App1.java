package com.softserve.hw6.task1;

public class App1 {
    static Bird[] birds = new Bird[4];

    public static void main(String[] args) {
        initialization();
        for (Bird bird :birds) {
            System.out.println(bird);
            System.out.println(bird.fly());
        }

    }
    static void initialization() {
        birds[0] = new Eagle(true, "long grey");
        birds[1] = new Swallow(true, "long black");
        birds[2] = new Penguin(true, "black and white");
        birds[3] = new Chicken(true, "brown");
    }
}
