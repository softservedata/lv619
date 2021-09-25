package oop.homework;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private int age;

    public Person() {}
    public Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge()
    {
        age = 2021-birthYear;
        return age;
    }
    public void input(String firstName, String lastName, int birthYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public void output()
    {
        getAge();
        System.out.println("Person's name:" + firstName + "\t Person's surname:" + lastName + "\tPerson's age:" + age);
    }
    public void changeName(String firstName, String lastName)
    {
        if(firstName == " ") {this.lastName=lastName;}
        else if(lastName == " ") {  this.firstName=firstName;}
        else {  this.firstName=firstName;
            this.lastName=lastName; }
    }
    public static void main(String[] args)
    {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        p1.input("James", "Wilson", 2002);
        p2.input("Robert", "Davies", 1995);
        p3.input("William", "Martin", 1999);
        p4.input("Daniel", "Hall", 2001);
        p5.input("Matthew", "Wood", 1989);
        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();
        System.out.println();
        System.out.println("Changing person's name:");
        p1.changeName("Andrew"," ");
        p1.output();
    }
}
