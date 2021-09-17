package com.softserve.pt4;

import java.util.Locale;

public class Country {
    enum Continents{ EUROPE, ASIA, NORTH_AMERICA, SOUTH_AMERICA, AFRICA, AUSTRALIA, MIDDLE_OF_NOWHERE

    }
    private String name;
    private Continents continent;

    public Country(String name) {
        setName(name);
        switch (name.toLowerCase()) {
            case "ukraine": case "italy": case "germany": case "spain":
                this.continent = Continents.EUROPE;
                break;
            case "usa": case "mexico": case "canada": case "cuba":
                this.continent = Continents.NORTH_AMERICA;
                break;
            case "brazil": case "chili": case "uruguay": case "bolivia":
                this.continent = Continents.SOUTH_AMERICA;
                break;
            case "egypt": case "algeria": case "chad": case "south africa":
                this.continent = Continents.AFRICA;
                break;
            case "china": case "japan": case "vietnam": case "korea":
                this.continent = Continents.ASIA;
                break;
            case "australia": case "new zeeland": case "fiji":
                this.continent = Continents.ASIA;
                break;
            default: continent = Continents.MIDDLE_OF_NOWHERE;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continents getContinent() {
        return continent;
    }

    public void setContinent(Continents continent) {
        this.continent = continent;
    }
}
