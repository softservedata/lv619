package com.softserve.STUDY1;

public class Main {
    public static void main(String[] args) {

//        Vehicle car1 = new Vehicle();
//        car1.passengers = 2;
//        car1.wheels = 6;
//        car1.maxspeed = 130;
//        car1.burnup = 30;
//
//        double distance = car1.maxspeed * 0.5;
//        System.out.println("За пол часа car1 может проехать " + distance + " км ");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Vehicle car1 = new Vehicle();
//        car1.passengers = 2;
//        car1.wheels = 4;
//        car1.maxspeed = 130;
//        car1.burnup = 30;
//
//        Vehicle bus1 = new Vehicle();
//        bus1.passengers = 45;
//        bus1.wheels = 6;
//        bus1.maxspeed = 100;
//        bus1.burnup = 45;
//
//        double time = 1.25;

//        double interval = 1.25;
//        double distanceCar = car1.maxspeed * interval;
//        double distanceBus = bus1.maxspeed * interval;
//        System.out.println("За 1 час 25 минут:\n car1 может пройти " + distanceCar + " км с " + car1.passengers
//                + " пассажирами\n " + "bus1 может пройти " + distanceBus + " км c " + bus1.passengers + " пассажирами ");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("автомобиль с " + car1.passengers + " пассажирами ");
//        car1.distance(time);
//        System.out.println("автобус с " + bus1.passengers + " пассажирами ");
//        bus1.distance(time);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Vehicle car = new Vehicle();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle bus = new Vehicle();
        bus.passengers = 45;
        bus.wheels = 6;
        bus.maxspeed = 100;
        bus.burnup = 45;

        double time = 1.25;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

//        System.out.println("За 1 час 25 минут:\n автомобиль может пройти " + distanceCar + " км с " + car.passengers
//                + " пассажирами\n " + "автобус может пройти " + distanceBus + " км c " + bus.passengers + " пассажирами ");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("За 1 час 25 минут:\n автомобиль может пройти " + car.distance(time) + " км с " + car.passengers
                + " пассажирами\n " + "автобус может пройти " + bus.distance(time) + " км c " + bus.passengers + " пассажирами ");

        if (car.distance(time) > bus.distance(time)) {
            System.out.println("Разница " + (car.distance(time) - bus.distance(time)) + " км в пользу автомобиля");
        }
    }
}
