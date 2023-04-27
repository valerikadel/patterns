package com.company.structural.bridge.abstraction;

import com.company.structural.bridge.implementation.TypeOfControl;

public class Laptop extends Computer {
    public Laptop(TypeOfControl typeOfControl) {
        this.typeOfControl = typeOfControl;
    }
}
