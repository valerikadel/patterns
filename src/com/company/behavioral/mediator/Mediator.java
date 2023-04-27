package com.company.behavioral.mediator;

public interface Mediator {
    public void sendMessage(String msg, User user);
    public void addUser(User... user);
}
