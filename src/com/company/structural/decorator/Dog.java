package com.company.structural.decorator;

public class Dog implements Pet {
    @Override
    public void walk() {
        System.out.println("Im dog and I go for a walk");
    }
}
