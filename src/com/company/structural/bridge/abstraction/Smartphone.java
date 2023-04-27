package com.company.structural.bridge.abstraction;

import com.company.structural.bridge.implementation.TypeOfControl;

public class Smartphone extends Computer {
    public Smartphone(TypeOfControl typeOfControl) {
        this.typeOfControl = typeOfControl;
    }
}
