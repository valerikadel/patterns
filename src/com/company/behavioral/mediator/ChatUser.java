package com.company.behavioral.mediator;

public class ChatUser extends User {
    public ChatUser(Mediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void send(String msg) {
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(String.format("%s : received - %s", this.name, msg));
    }
}
