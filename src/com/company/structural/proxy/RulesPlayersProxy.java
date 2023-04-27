package com.company.structural.proxy;

public class RulesPlayersProxy implements PlayWithFire {
    private PlayWithFire playWithFire;

    public RulesPlayersProxy(Person person) {
        this.playWithFire = new NoRulesPlayers(person);
    }
    @Override
    public void play() {
        Person person= getPlayer();
        if (person.ageType.equals("adult")){
            playWithFire.play();
            return;
        }
        System.out.println(String.format("Спички детям не игрушка, %s", person.name));
    }

    @Override
    public Person getPlayer() {
        return playWithFire.getPlayer();
    }
}
