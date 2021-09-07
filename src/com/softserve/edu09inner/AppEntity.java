package com.softserve.edu09inner;

public class AppEntity {
    public static void main(String[] args) {
        Entity e1 = new Entity();
        Entity e2 = new Entity();
        Entity e3 = new Entity();
        System.out.println("1. Count of Entity objects = " + Entity.getCount());
        Entity.Counter counter = new Entity.Counter();
        System.out.println("2. Count of Entity objects = " + counter.getCount());
        System.out.println("3. Entity getCountInfo = " + new Entity().getCountInfo());
    }
}