package com.company.behavioral.command;

public class ShoutCommand implements Command {
    private Cat cat;

    public ShoutCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void execute() {
        cat.shout();
    }
}
