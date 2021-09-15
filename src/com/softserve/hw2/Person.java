package com.softserve.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Person {
    private String firstName, lastName;
    private int birthYear = 2003;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {

        return 2021 - this.birthYear;
    }

    public void input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input First Name");
        setFirstName(reader.readLine());
        System.out.println("Input Last Name");
        setLastName(reader.readLine());
        System.out.println("Input Birth Year");
        setBirthYear(Integer.parseInt(reader.readLine()));
    }

    public void output() {
        System.out.println(this);
    }

    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }


    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int getBirthYear() {
        return birthYear;
    }

    private void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Years=" + getAge() +
                '}';
    }
}
