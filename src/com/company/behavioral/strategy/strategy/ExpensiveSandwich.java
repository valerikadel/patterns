package com.company.behavioral.strategy.strategy;

import com.company.behavioral.strategy.SandwichReceipt;

import java.util.List;

public class ExpensiveSandwich extends SandwichStrategy {
    @Override
    public void createReceipt() {
        receipt = new SandwichReceipt("bread", List.of("cheese", "tomato", "tomato", "peperoni"), "black bread");
    }
    @Override
    public void sayHello() {
        System.out.println("Lets cook an expensive sandwich");
    }
}
