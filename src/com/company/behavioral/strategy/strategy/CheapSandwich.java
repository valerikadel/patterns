package com.company.behavioral.strategy.strategy;

import com.company.behavioral.strategy.SandwichReceipt;

import java.sql.SQLOutput;
import java.util.Optional;

public class CheapSandwich extends SandwichStrategy {
    public CheapSandwich() {
    }
    @Override
    public void createReceipt() {
        receipt = new SandwichReceipt("cheese",null,"bread");
    }
    @Override
    public void sayHello() {
        System.out.println("Lets cook a cheap sandwich");
    }
}
