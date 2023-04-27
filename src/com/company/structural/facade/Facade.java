package com.company.structural.facade;

public class Facade {
    private FirstService firstService;
    private SecondService secondService;

    public Facade(FirstService firstService, SecondService secondService) {
        this.firstService = firstService;
        this.secondService = secondService;
    }

    public void doAction(){
        firstService.doRandom();
        firstService.doRandom();
        firstService.doRandom();
        firstService.doRandom();
        firstService.doRandom();
        secondService.doRandomString();
        secondService.doRandomString();
        secondService.doRandomString();
        secondService.doRandomString();
    }
}
