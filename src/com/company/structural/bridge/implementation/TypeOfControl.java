package com.company.structural.bridge.implementation;

public abstract class TypeOfControl {
    protected String control;

    public TypeOfControl(String control) {
        this.control = control;
    }
    public void move() {
        System.out.printf("I do it with %s%n", this.control);
    }
}
