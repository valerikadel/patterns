package com.company.structural.decorator;

public class Cat implements Pet {
    @Override
    public void walk() {
        System.out.println("Im cat and I go for a walk");
    }
}
