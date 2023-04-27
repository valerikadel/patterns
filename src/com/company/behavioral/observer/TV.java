package com.company.behavioral.observer;

public class TV implements Subscriber {
    @Override
    public void update() {
        System.out.println("TV notified");
    }
}
