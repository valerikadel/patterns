package com.company.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    private final List<Contact> contacts = new ArrayList<>();
    public void fill(String name,String gender,String city){
        GenderCityFlyweight flyweight = FlyweightFactory.getFlyweight(city,gender);
        contacts.add(new Contact(name,flyweight));
    }
    public void show(){
        contacts.forEach(System.out::println);
    }
}
