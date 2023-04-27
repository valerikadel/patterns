package com.company.behavioral.mediator;

public abstract class User {
    Mediator mediator;
    String name;
    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
