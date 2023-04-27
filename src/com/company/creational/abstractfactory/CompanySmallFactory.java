package com.company.creational.abstractfactory;

public class CompanySmallFactory implements AbstractFactory {
    @Override
    public Table createTable() {return new TableSmall();    }
    @Override
    public Chair createChair() {
        return new ChairSmall();
    }
}
