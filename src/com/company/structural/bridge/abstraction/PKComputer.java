package com.company.structural.bridge.abstraction;

import com.company.structural.bridge.implementation.TypeOfControl;

public class PKComputer extends Computer {
    public PKComputer(TypeOfControl typeOfControl) {
        this.typeOfControl = typeOfControl;
    }
}
