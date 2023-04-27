package com.company.behavioral.state;

public class Printer {
    private State state;
    public Printer() {
        state = new TurnOffState(this);
    }
    public void setState(State state) {
        this.state = state;
    }
    public String turnOff() {
        return "Printer is turn off";
    }
    public String turnOn() {
        return "Printer is turn on";
    }
    public String pressPrint() {
        return "Printer is printing";
    }
    public String pressTurnOnOffButton(){
        return state.buttonOnOff();
    }
    public String pressPrintButton(){
        return state.buttonPrint();
    }
}
