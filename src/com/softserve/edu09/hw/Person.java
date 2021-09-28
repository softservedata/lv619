package com.softserve.edu09.hw;

interface IFirstname {
    ILastname setFirstname(String firstname);
}

interface ILastname {
    IEmail setLastname(String lastname);
}

interface IEmail {
    ILogin setEmail(String email);
}

interface ILogin {
    IPassword setLogin(String login);
}

interface IPassword {
    IBuildPerson setPassword(String password);
}

interface IBuildPerson {
    IBuildPerson setCity(String city);
    IBuildPerson setPhone(String phone);
    IPerson build();
}

public class Person implements IFirstname, ILastname, IEmail,
            ILogin, IPassword, IBuildPerson, IPerson {

    private String firstname;
    private String lastname;
    private String email;
    private String login;
    private String password;
    private String city; // opt
    private String phone; // opt

    /*-
    public Person(String firstname, String lastname,
            String email, String login,
            String password, String city,
            String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.login = login;
        this.password = password;
        this.city = city;
        this.phone = phone;
    }
    */

    /*-
    public Person() {
        this.firstname = "";
        this.lastname = "";
        this.email = "";
        this.login = "";
        this.password = "";
        this.city = "";
        this.phone = "";
    }
    */

    private Person() {
        //this.firstname = "";
        //this.lastname = "";
        //this.email = "";
        //this.login = "";
        //this.password = "";
        this.city = "";
        this.phone = "";
    }

    public static IFirstname get() {
        return new Person();
    }

    // setters

    public ILastname setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public IEmail setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ILogin setEmail(String email) {
        this.email = email;
        return this;
    }

    public IPassword setLogin(String login) {
        this.login = login;
        return this;
    }

    public IBuildPerson setPassword(String password) {
        this.password = password;
        return this;
    }

    public Person setCity(String city) {
        this.city = city;
        return this;
    }

    public Person setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public IPerson build() {
        return this;
    }
    
    // getters

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

}
