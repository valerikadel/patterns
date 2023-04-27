package com.company.creational.abstractfactory;

public class CompanyBigFactory implements AbstractFactory {
    @Override
    public Table createTable() {        return new TableBig();
    }
    @Override
    public Chair createChair() {
        return new ChairBig();
    }
}
