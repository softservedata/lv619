package com.softserve.edu6.homework1;

public class App {
    public static void main(String[] args) {
        Bird[] birds = {
                new Chicken("Brown"),
                new Eagle("White",5000,100),
                new Penguin("Black"),
                new Swallow("Blue",1000,70),
                new FlyingBirds("Red",800,40),
                new NonFlyingBirds("Green")
        };

        for(Bird bird : birds) {
            bird.fly();
            System.out.println(bird);
        }
    }

}
