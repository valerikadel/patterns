package com.company.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler = new WakeUp();
        handler.setNextHandler(new TakeShower())
                .setNextHandler(new DrinkCoffee());
        handler.handle();

        //так как кофе - это последнее действие, то setNext
        //в данном случае ничего не выведет.
        Handler handler1 = new DrinkCoffee();
        handler1.setNextHandler(new TakeShower());
        handler1.handle();
    }
}
