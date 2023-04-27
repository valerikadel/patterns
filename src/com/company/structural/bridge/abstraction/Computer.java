package com.company.structural.bridge.abstraction;

import com.company.structural.bridge.implementation.TypeOfControl;

public abstract class Computer {
    protected TypeOfControl typeOfControl;
    public void moveControl(){
        typeOfControl.move();
    }
}
