package com.company.structural.facade;

public class Main {
    public static void main(String[] args) {
        Facade f = new Facade(new FirstService(),new SecondService());
        f.doAction();
    }
}
