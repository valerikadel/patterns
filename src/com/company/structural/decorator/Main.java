package com.company.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pet cat = new CatDecorator(new Cat());
        Pet dog = new DogDecorator(new Dog());
        Pet strangeCat = new DogDecorator(new CatDecorator(new Cat()));

        cat.walk();
        dog.walk();
        strangeCat.walk();
    }
}
