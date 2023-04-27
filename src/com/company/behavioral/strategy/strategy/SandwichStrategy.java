package com.company.behavioral.strategy.strategy;

import com.company.behavioral.strategy.SandwichReceipt;

import java.util.Optional;

public abstract class SandwichStrategy {
    protected SandwichReceipt receipt;

    public abstract void createReceipt();
    public abstract void sayHello();
    public void addAbove() {
        System.out.println(receipt.getAbove());
    }
    public void addMiddle() {
        Optional.ofNullable(receipt.getMiddle())
                .ifPresent(c -> c.forEach(System.out::println));
    }
    public void addDown() {
        System.out.println(receipt.getDown());
    }
}
