package com.company.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory fB = new CompanyBigFactory();
        Table tB = fB.createTable();
        Chair cB = fB.createChair();

        AbstractFactory fS = new CompanySmallFactory();
        Table tS = fS.createTable();
        Chair cS = fS.createChair();
    }
}
