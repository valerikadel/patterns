package com.company.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        FactoryProductA fmA = new FactoryProductA();
        Product pA = fmA.createProduct();

        FactoryProductB fmB = new FactoryProductB();
        Product pB = fmB.createProduct();
    }
}
