package com.softserve.refresh;

abstract class Appliance {
    String brand;
    String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void  displayInfo();

    public class WashingMachine extends Appliance{
        int loadCapacity;

        public WashingMachine(String brand, String model, int loadCapacity) {
            super(brand, model);
            this.loadCapacity = loadCapacity;
        }

        @Override
        public void displayInfo() {
            System.out.println("Washing Machine - Brand: " + brand + ", Model: " + model + ", Load Capacity: "
            + loadCapacity + " kg");
        }
    }

    public class Refrigerator extends Appliance{
        int capacity;

        public Refrigerator(String brand, String model, int capacity) {
            super(brand, model);
            this.capacity = capacity;
        }

        @Override
        public void displayInfo() {
            System.out.println("Refrigerator - Brand: " + brand + ", Model: " + model + ", Capacity: "
                    + capacity + " litters");
        }
    }


}
