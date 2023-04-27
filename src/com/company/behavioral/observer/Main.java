package com.company.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        AppWithEvents app = new AppWithEvents();

        Subscriber tv = new TV();
        Subscriber phone = new Phone();
        Publisher publisher = app.getPublisher();
        publisher.addSubs(tv, phone);

        Subscriber tv2 = new TV();
        publisher.subscribe(tv2);

        app.somethingHappen();
    }
}
