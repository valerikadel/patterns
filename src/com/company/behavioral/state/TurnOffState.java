package com.company.behavioral.state;

public class TurnOffState extends State {
    public TurnOffState(Printer printer) {
        super(printer);
    }

    @Override
    public String buttonOnOff() {
        this.printer.setState(new TurnOnState(this.printer));
        return this.printer.turnOn();
    }

    @Override
    public String buttonPrint() {
        this.printer.setState(this);
        return this.printer.turnOff();
    }
}
