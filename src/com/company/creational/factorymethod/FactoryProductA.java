package com.company.creational.factorymethod;

public class FactoryProductA extends FactoryMethod {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
