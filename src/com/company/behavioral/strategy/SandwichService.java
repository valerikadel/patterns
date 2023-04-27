package com.company.behavioral.strategy;

import com.company.behavioral.strategy.strategy.SandwichStrategy;

public class SandwichService {
    private SandwichStrategy strategy;
    public SandwichService() {    }
    public void setStrategy(SandwichStrategy strategy) {
        this.strategy = strategy;
    }
    public void cook(){
        strategy.sayHello();
        strategy.createReceipt();
        strategy.addAbove();
        strategy.addMiddle();
        strategy.addDown();
    }
}
