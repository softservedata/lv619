package com.softserve.edu3;
import java.util.Scanner;
public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        firstName = "";
        lastName = "";
        birthYear = 0;
    }
    public Person(String firstName, String lastName) {
        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }
    public String getLastName() {
        return lastName;
    }
    public void setBirthYear(int birthYear) {
        if (birthYear > 1880 && birthYear < 2021) {
            this.birthYear = birthYear;
        }
        else {
            System.out.println("Incorrect data");
        }
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getAge() {
        return 2021-birthYear;
    }
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write firstName:");
        firstName = in.nextLine();
        System.out.println("Write lastName:");
        lastName = in.nextLine();
        System.out.println("Write birthYear:");
        birthYear = in.nextInt();
    }
    public void output() {
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("birhtYear " + birthYear);
        System.out.println("age = " + getAge());
    }
    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }
}
