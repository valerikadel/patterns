package com.company.structural.proxy;

public class NoRulesPlayers implements PlayWithFire {
    private Person person;
    public NoRulesPlayers(Person person) {
        this.person = person;
    }
    @Override
    public void play() {
        System.out.println(String.format("Я %s и я %s и я играю со спичками", person.name,person.ageType));
    }

    @Override
    public Person getPlayer() {
        return person;
    }
}
