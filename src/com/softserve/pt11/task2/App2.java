package com.softserve.pt11.task2;

public class App2 {
    static Plant[] plants = new Plant[5];

    public static void main(String[] args) {
        try {
            plants[0] = new Plant("rose", "blue", 25);
            plants[1] = new Plant("tulip", "red", 20);
            plants[2] = new Plant("aster", "white", 25);
            plants[3] = new Plant("rose", "yellow", 25);
            plants[4] = new Plant("violet", "blue", 25);
        }
        catch (TypeException | ColorException e) {
            System.out.println("Wrong type or color");
        }

        for (Plant plant: plants) {
            System.out.println(plant);
        }

    }
}
