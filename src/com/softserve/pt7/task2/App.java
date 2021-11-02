package com.softserve.pt7.task2;

public class App {
    static Person[] persons = new Person[3];

    public static void main(String[] args) {
        initialization();
        for (Person person: persons) {
            person.print();
            if (person instanceof Staff) {
                System.out.println(((Staff) person).salary());
            }
        }

    }
    static void initialization() {
        persons[0] = new Teacher("Petro");
        persons[1] = new Cleaner("ivan");
        persons[2] = new Student("Mykola");
    }
}
