package com.company.creational.builder;

public class Director {
    public void createSmartPhone(Builder builder) {
        builder.system("OS")
                .memoryCapacity(64);
    }

    public void createHomePhone(Builder builder) {
        builder.name("HomePhone");
    }
}
