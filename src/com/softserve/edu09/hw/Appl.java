package com.softserve.edu09.hw;

public class Appl {
    public static void main(String[] args) {
        /*- 1 Classic Constructor
        Person person = new Person("firstname1", "lastname1",
                "email1", "login1", "password1", "city1", "phone1");
        System.out.println("login = " + person.getLogin());
        */
        /*- 2 Defaul Constructor + Setters
        Person person = new Person();
        person.setFirstname("firstname2");
        person.setLastname("lastname2");
        person.setEmail("email2");
        person.setLogin("login2");
        person.setPassword("password2");
        person.setCity("city2");
        person.setPhone("phone2");
        System.out.println("login = " + person.getLogin());
        */
        /*- 3 Add Static Factory + Fluent Interface
        Person person = Person.get()
                .setFirstname("firstname3")
                .setLastname("lastname3")
                .setEmail("email3")
                .setLogin("login3")
                .setPassword("password3")
                .setCity("city3")
                .setPhone("phone3");
        System.out.println("login = " + person.getLogin());
        */
        /*- 4 Add Builder
        Person person = Person.get()
                .setFirstname("firstname4")
                .setLastname("lastname4")
                .setEmail("email4")
                .setLogin("login4")
                .setPassword("password4")
                .setPhone("phone4")
                .build();
        System.out.println("login = " + person.getLogin());
        */
        // 5 Add Dependency Inversion
        IPerson person = Person.get()
                .setFirstname("firstname5")
                .setLastname("lastname5")
                .setEmail("email5")
                .setLogin("login5")
                .setPassword("password5")
                .setPhone("phone5")
                .build();
        System.out.println("login = " + person.getLogin());
    }
}
