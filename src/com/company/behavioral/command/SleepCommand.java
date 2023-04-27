package com.company.behavioral.command;

public class SleepCommand implements Command {
    private Cat cat;

    public SleepCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void execute() {
        this.cat.sleep();
    }
}
