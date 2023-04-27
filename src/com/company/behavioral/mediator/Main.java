package com.company.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorChat();
        User user1 = new ChatUser(mediator, "user1");
        User user2 = new ChatUser(mediator, "user2");
        User user3 = new ChatUser(mediator, "user3");
        mediator.addUser(user1, user2, user3);

        user2.send("улалала");
    }
}
