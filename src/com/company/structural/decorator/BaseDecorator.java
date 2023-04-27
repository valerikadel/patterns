package com.company.structural.decorator;

public abstract class BaseDecorator implements Pet {
    private Pet pet;
    public BaseDecorator(Pet pet) {
        this.pet = pet;
    }
    @Override
    public void walk() {
        pet.walk();
    }
}
