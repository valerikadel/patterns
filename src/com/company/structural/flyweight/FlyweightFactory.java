package com.company.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String,GenderCityFlyweight> dictionary =new HashMap<>();
    public static GenderCityFlyweight getFlyweight(String city,String gender){
        if(!dictionary.containsKey(city)){
            dictionary.put(city,new GenderCityFlyweight(city, gender));
        }
        return dictionary.get(city);
    }
}
