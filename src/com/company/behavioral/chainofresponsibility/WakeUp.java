package com.company.behavioral.chainofresponsibility;

public class WakeUp extends Handler {
    @Override
    public boolean handle() {
        System.out.println("Проснулся!");
        return handleNext();
    }
}
