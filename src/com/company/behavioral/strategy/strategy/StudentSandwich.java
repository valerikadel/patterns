package com.company.behavioral.strategy.strategy;

import com.company.behavioral.strategy.SandwichReceipt;

import java.util.List;

public class StudentSandwich extends SandwichStrategy {
    @Override
    public void createReceipt() {
        receipt = new SandwichReceipt("cheese", List.of("sausage"), "bread");
    }
    @Override
    public void sayHello() {
        System.out.println("Lets cook a student sandwich");
    }
}
