package com.company.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        CatInvoker catInvokerSleep = new CatInvoker(new SleepCommand(cat));
        CatInvoker catInvokerEat = new CatInvoker(new EatCommand(cat));
        CatInvoker catInvokerShout = new CatInvoker(new ShoutCommand(cat));
        catInvokerSleep.invoke();
        catInvokerEat.invoke();
        catInvokerShout.invoke();
    }
}
