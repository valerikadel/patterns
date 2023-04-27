package com.company.structural.flyweight;

public class Contact {
    private String name;
    private GenderCityFlyweight flyweight;

    public Contact(String name, GenderCityFlyweight flyweight) {
        this.name = name;
        this.flyweight = flyweight;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", flyweight=" + flyweight +
                '}';
    }
}
