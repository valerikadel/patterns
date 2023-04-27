package com.company.behavioral.state;

public abstract class State {
    protected Printer printer;
    public State(Printer printer) {
        this.printer = printer;
    }
    public abstract String buttonOnOff();
    public abstract String buttonPrint();
}
