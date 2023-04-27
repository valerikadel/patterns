package com.company.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//сам публикатор.с методами отписки/подписки
public class Publisher {
    List<Subscriber> subscribers;
    public Publisher() {
        this.subscribers = new ArrayList<>();
    }
    public void addSubs(Subscriber... subscribers) {
        this.subscribers.addAll(List.of(subscribers));
    }
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
    public void notifySubs() {
        this.subscribers
                .forEach(Subscriber::update);
    }
}
