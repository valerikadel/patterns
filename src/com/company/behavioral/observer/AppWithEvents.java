package com.company.behavioral.observer;
//тот,кто генерирует события и публикует их
public class AppWithEvents {
    private final Publisher publisher;
    public Publisher getPublisher() {
        return publisher;
    }
    public AppWithEvents() {
        this.publisher = new Publisher();
    }
    public void somethingHappen() {
        publisher.notifySubs();
    }
}
