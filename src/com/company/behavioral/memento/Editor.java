package com.company.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private User user;
    private Deque<User.MementoUser> history;
    public Editor(User user) {
        this.user = user;
        history = new ArrayDeque<>();
    }
    public void editUser(String newName, int newAge) {
        this.user.setName(newName);
        this.user.setAge(newAge);
        history.add(this.user.makeSnapshot());
    }
    public void undo() {
        history.pollLast();
        user.restore(history.peekLast());
    }
    public void print() {
        System.out.println( user.toString());
    }
}
