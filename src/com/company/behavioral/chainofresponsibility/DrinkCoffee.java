package com.company.behavioral.chainofresponsibility;

public class DrinkCoffee extends Handler {
    @Override
    public boolean handle() {
        System.out.println("Попил кофе!");
        return true;
    }
}
