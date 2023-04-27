package com.company.behavioral.command;

public class CatInvoker {
    private Command command;

    public CatInvoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        this.command.execute();
    }
}
