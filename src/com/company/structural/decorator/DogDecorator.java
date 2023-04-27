package com.company.structural.decorator;

public class DogDecorator extends BaseDecorator {
    public DogDecorator(Pet pet) {
        super(pet);
    }
    @Override
    public void walk() {
        super.walk();
        System.out.println("I found a stone!");
    }
}
