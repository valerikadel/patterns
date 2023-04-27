package com.company.structural.flyweight;

public class GenderCityFlyweight {
    private final String gender;
    private final String city;

    public GenderCityFlyweight(String gender, String city) {
        this.gender = gender;
        this.city = city;
    }

    @Override
    public String toString() {
        return "GenderCityFlyweight{" +
                "gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
