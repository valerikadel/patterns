package com.company.creational.factorymethod;

public class FactoryProductB extends FactoryMethod {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
