package com.softserve.HWork04;

import java.time.LocalDate;
import java.util.Scanner;

public class Person extends Main {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        birthYear = birthYear;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        return today.getYear() - birthYear;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstName = in.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = in.nextLine();
        System.out.println("Please enter your birth year: ");
        birthYear = in.nextInt();
    }

    public void output() {
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("birhtYear " + birthYear);
        System.out.println("age = " + getAge() + "\n");
        return;
    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);

    }
}





