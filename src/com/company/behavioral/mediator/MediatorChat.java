package com.company.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorChat implements Mediator {
    private List<User> users;
    public MediatorChat() {
        this.users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User user) {
        users.stream()
                .filter(u -> !u.equals(user))
                .forEach(u -> u.receive(msg));
    }
    @Override
    public void addUser(User... user) {
        this.users.addAll(List.of(user));
    }
}
