package com.company.structural.proxy;

public class Main {
    public static void main(String[] args) {
        PlayWithFire play = new RulesPlayersProxy(new Person("Oleg","adult"));
        play.play();

        PlayWithFire playChild=new RulesPlayersProxy(new Person("Masha","child"));
        playChild.play();
    }
}
