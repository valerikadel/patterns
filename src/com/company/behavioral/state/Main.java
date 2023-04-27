package com.company.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.pressTurnOnOffButton());
        System.out.println(printer.pressTurnOnOffButton());
        System.out.println(printer.pressPrintButton());
        System.out.println(printer.pressTurnOnOffButton());
        System.out.println(printer.pressPrintButton());
    }
}
