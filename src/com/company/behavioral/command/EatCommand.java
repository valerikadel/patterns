package com.company.behavioral.command;

public class EatCommand implements Command {
    private Cat cat;
    public EatCommand(Cat cat) {
        this.cat = cat;
    }
    @Override
    public void execute() {
        this.cat.eat();
    }
}
