package com.company.behavioral.chainofresponsibility;

public class TakeShower extends Handler {
    @Override
    public boolean handle() {
        System.out.println("Принял душ!");
        return handleNext();
    }
}
