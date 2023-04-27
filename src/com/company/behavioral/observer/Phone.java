package com.company.behavioral.observer;

public class Phone implements Subscriber {
    @Override
    public void update() {
        System.out.println("Phone notified");
    }
}
