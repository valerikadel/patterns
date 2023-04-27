package com.company.structural.decorator;

public class CatDecorator extends BaseDecorator {
    public CatDecorator(Pet pet) {
        super(pet);
    }
    @Override
    public void walk() {
        super.walk();
        System.out.println("I caught a mouse!");
    }
}
