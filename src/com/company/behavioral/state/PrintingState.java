package com.company.behavioral.state;

public class PrintingState extends State {
    public PrintingState(Printer printer) {
        super(printer);
    }
    @Override
    public String buttonOnOff() {
        this.printer.setState(new TurnOffState(this.printer));
        return this.printer.turnOff();
    }
    @Override
    public String buttonPrint() {
        this.printer.setState(new PrintingState(this.printer));
        return this.printer.pressPrint();
    }
}
